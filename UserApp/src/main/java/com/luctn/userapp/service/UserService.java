package com.luctn.userapp.service;

import com.luctn.user.thrift.TUserResult;
import com.luctn.user.thrift.wrapper.TUserClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final TUserClient client;

    public UserService(@Value("${TUserClient.host}") String host, @Value("${TUserClient.port}") int port) {
        this.client = new TUserClient(host, port);
    }

    public TUserResult getUser(int userId) {
        return client.getUserById(userId);
    }

}
