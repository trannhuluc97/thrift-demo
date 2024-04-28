package com.luctn.user.thrift.wrapper;

import com.luctn.user.thrift.TSource;
import com.luctn.user.thrift.TUserResult;
import com.luctn.user.thrift.TUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TUserClient {

    private String host;
    private int port;
    private int timeout;
    private int nRetry;
    private static TSource source;
    ThriftClientPool pool;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public static int Integer_NO_CONNECTION = -1001;
    public static int Integer_BAD_REQUEST = -1002;

    public TUserClient(String host, int port, int timeout, int nRetry) {
        source = ThriftUtils.buildConfigSource();

        this.host = host;
        this.port = port;
        this.timeout = timeout;
        this.nRetry = nRetry;
    }

    public TUserResult getUserById(int userId) {
        try {
            for (int retry = 0; retry < nRetry; retry++) {
                if (pool == null) {
                    pool = new ThriftClientPool(host, port, timeout);
                }
                TUserService.Client client = pool.getClient();
                if (client == null) {
                    return new TUserResult(Integer_NO_CONNECTION);
                }
                return client.getUserById(userId, source);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new TUserResult(Integer_BAD_REQUEST);
        }
        return new TUserResult(Integer_BAD_REQUEST);
    }

}
