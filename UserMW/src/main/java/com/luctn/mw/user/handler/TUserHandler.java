package com.luctn.mw.user.handler;

import com.luctn.user.thrift.TException;
import com.luctn.user.thrift.TUser;
import com.luctn.user.thrift.TUserResult;
import com.luctn.user.thrift.TUserService;

import java.util.List;

public class TUserHandler implements TUserService.Iface {

    @Override
    public TUserResult getUserById(int userId) throws TException, org.apache.thrift.TException {
        TUserResult result = new TUserResult(0);
        result.setMessage("Success");

        TUser user = new TUser();
        user.setId(userId);
        user.setName("Luc");

        result.setData(user);
        return result;
    }

    @Override
    public void save(TUser tUser) throws TException, org.apache.thrift.TException {

    }

    @Override
    public List<TUser> getList() throws TException, org.apache.thrift.TException {
        return List.of();
    }

    @Override
    public boolean ping() throws TException, org.apache.thrift.TException {
        return false;
    }
}
