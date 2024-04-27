package com.luctn.user.thrift.wrapper;


import com.luctn.user.thrift.TUser;
import com.luctn.user.thrift.TUserService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TUserClient {

    private String host;
    private int port;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public TUserClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public TUser get(int studentId) {
        TUserService.Client client;
        TTransport transport = null;
        try {
            transport = new TSocket(host, port);
            transport.open();
            logger.info("Connected to {} on {}", host, port);
            TProtocol protocol = new TBinaryProtocol(transport);
            client = new TUserService.Client(protocol);
            TUser result = client.get(studentId);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (transport != null) {
                transport.close();
            }
        }
        return null;
    }

}
