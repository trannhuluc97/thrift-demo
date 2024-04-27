package com.luctn.user.thrift.wrapper;


import com.luctn.user.thrift.TUser;
import com.luctn.user.thrift.TUserResult;
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

    public static int Integer_NO_CONNECTION = -1001;
    //public static int Integer_BAD_REQUEST = -1002;
    //public static int Integer_BAD_CONNECTION = -1003;

    public TUserClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public TUserResult getUserById(int userId) {
        TUserService.Client client;
        TTransport transport = null;
        try {
            transport = new TSocket(host, port);
            transport.open();
            logger.info("getUserById | Connected to {} on {}", host, port);
            TProtocol protocol = new TBinaryProtocol(transport);
            client = new TUserService.Client(protocol);
            return client.getUserById(userId);
        } catch (Exception e) {
            e.printStackTrace();
            return new TUserResult(Integer_NO_CONNECTION);
        } finally {
            if (transport != null) {
                transport.close();
            }
        }
    }

}
