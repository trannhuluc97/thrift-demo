package com.luctn.user.thrift.wrapper;

import com.luctn.user.thrift.TUserService;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;

import java.time.Duration;

public class ThriftClientPool {

    private final String host;
    private final int port;
    private final ObjectPool<TUserService.Client> pool;

    public ThriftClientPool(String host, int port, int timeout) throws Exception {
        this.host = host;
        this.port = port;

        // Thrift client setup (replace with your specific service)
        TSocket transport = new TSocket(host, port);
        transport.open(); // Open transport on each borrow
        TProtocol protocol = new TBinaryProtocol(transport);

        // Pool configuration - minimal settings
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        config.setMinIdle(1);
        config.setMaxIdle(10);
        config.setMaxWaitMillis(timeout);

        // Simple factory creating new clients on borrow
        BasePooledObjectFactory<TUserService.Client> factory = new BasePooledObjectFactory<TUserService.Client>() {
            @Override
            public TUserService.Client create() throws Exception {
                TUserService.Client client = new TUserService.Client(protocol);
                return client;
            }

            @Override
            public PooledObject<TUserService.Client> wrap(TUserService.Client obj) {
                return new DefaultPooledObject<>(obj);
            }
        };

        pool = new GenericObjectPool<>(factory, config);
    }

    public TUserService.Client getClient() throws Exception {
        return pool.borrowObject();
    }

    public void close() throws Exception {
        pool.close();
    }
}
