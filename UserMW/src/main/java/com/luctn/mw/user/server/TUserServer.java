package com.luctn.mw.user.server;

import com.luctn.mw.user.handler.TUserHandler;
import com.luctn.user.thrift.TUserService;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

public class TUserServer {
    private TServer server;

    public void start() throws TTransportException {
        TServerTransport serverTransport = new TServerSocket(9999);

        server = new TSimpleServer(new TServer.Args(serverTransport).processor(
                new TUserService.Processor<>(new TUserHandler())));
        System.out.print("Starting the server... ");

        server.serve();
        System.out.println("done.");
    }

    public void stop() {
        if (server != null && server.isServing()) {
            System.out.print("Stopping the server... ");

            server.stop();
            System.out.println("done.");
        }
    }
}
