package com.luctn.userapp.service;

import com.luctn.user.thrift.TUserResult;
import com.luctn.user.thrift.wrapper.TUserClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    private final TUserClient client;

    public UserService(
            @Value("${TUserClient.host}") String host,
            @Value("${TUserClient.port}") int port,
            @Value("${TUserClient.timeout}") int timeout,
            @Value("${TUserClient.nRetry}") int nRetry) {
        this.client = new TUserClient(host, port, timeout, nRetry);
    }

    public TUserResult getUser(int userId) {
        return client.getUserById(userId);
    }

}
