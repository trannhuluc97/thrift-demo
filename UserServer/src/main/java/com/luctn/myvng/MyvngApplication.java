package com.luctn.myvng;

import com.luctn.user.thrift.TUser;
import com.luctn.user.thrift.wrapper.TUserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyvngApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyvngApplication.class, args);

		TUserClient client = new TUserClient("localhost", 9999);
		TUser tUser = client.get(123);
		System.out.println(tUser);
	}

}
