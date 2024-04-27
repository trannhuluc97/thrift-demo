package com.luctn.user.thrift.wrapper;

import com.luctn.user.thrift.TSource;
import com.luctn.user.thrift.TUserResult;
import com.luctn.user.thrift.TUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

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
        _configSource();

        this.host = host;
        this.port = port;
        this.timeout = timeout;
        this.nRetry = nRetry;
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
