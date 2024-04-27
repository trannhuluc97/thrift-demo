package com.luctn.mw.user;

import com.luctn.mw.user.server.TUserServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TTransportException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) throws TTransportException {
		SpringApplication.run(UserApplication.class, args);
		TUserServer server = new TUserServer();
		server.start();
	}

}
