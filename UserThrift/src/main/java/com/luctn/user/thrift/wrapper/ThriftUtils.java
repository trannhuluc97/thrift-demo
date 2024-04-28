package com.luctn.user.thrift.wrapper;


import com.luctn.user.thrift.TSource;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class ThriftUtils {
    public static TSource buildConfigSource() {
        TSource source = new TSource();
        try {
            String appName = "unknown";
            Object loggedApplicationName = System.getProperties().get("LOGGED_APPLICATION_NAME");
            if (loggedApplicationName != null) {
                appName = loggedApplicationName.toString();
            } else {
                Object userDirObj = System.getProperties().get("user.dir");
                if (userDirObj != null) {
                    String[] parts = userDirObj.toString().split("/");
                    appName = parts[parts.length - 1];
                }
            }

            source = new TSource(appName, getIpAddr());
        } catch (Exception ex) {
        }

        return source;
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
