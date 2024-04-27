package com.luctn.user.thrift.wrapper;


import com.luctn.user.thrift.TSource;
import com.luctn.user.thrift.TUserResult;
import com.luctn.user.thrift.TUserService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class TUserClient {

    private String host;
    private int port;
    private static TSource source;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public static int Integer_NO_CONNECTION = -1001;
    //public static int Integer_BAD_REQUEST = -1002;
    //public static int Integer_BAD_CONNECTION = -1003;

    public TUserClient(String host, int port) {
        _configSource();
        this.host = host;
        this.port = port;
    }

    private void _configSource() {
        try {
            String appName = "unknown";
            Object loggedApplicationName = System.getProperties().get("LOGGED_APPLICATION_NAME");
            if (loggedApplicationName != null) {
                appName = loggedApplicationName.toString();
            }

            source = new TSource(appName, getIpAddr());
        } catch (Exception ex) {
            logger.error("", ex);
        }
    }

    public TUserResult getUserById(int userId) {
        TUserService.Client client;
        TTransport transport = null;
        try {
            transport = new TSocket(host, port);
            transport.open();
            logger.info("getUserById | Connected to {} on {} | source {}", host, port, source);
            TProtocol protocol = new TBinaryProtocol(transport);
            client = new TUserService.Client(protocol);
            return client.getUserById(userId, source);
        } catch (Exception e) {
            e.printStackTrace();
            return new TUserResult(Integer_NO_CONNECTION);
        } finally {
            if (transport != null) {
                transport.close();
            }
        }
    }

    private static String getIpAddr() {
        String ipAddr;
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
                    InetAddress inetAddr = enumIpAddr.nextElement();
                    if (inetAddr.isSiteLocalAddress()) {
                        ipAddr = inetAddr.getHostAddress();
                        if (!ipAddr.equalsIgnoreCase("localhost") && !ipAddr.startsWith("127")) {
                            return ipAddr;
                        }
                    }
                }
            }
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
        return "localhost";
    }

}
