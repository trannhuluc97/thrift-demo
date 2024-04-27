package com.luctn.userapp;

import com.luctn.user.thrift.TUserResult;
import com.luctn.user.thrift.wrapper.TUserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);

		TUserClient client = new TUserClient("localhost", 9999);
		TUserResult tUser = client.getUserById(123);
		System.out.println(tUser);
	}

}
