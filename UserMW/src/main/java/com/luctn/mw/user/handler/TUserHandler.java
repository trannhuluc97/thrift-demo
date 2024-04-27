package com.luctn.mw.user.handler;

import com.luctn.user.thrift.TException;
import com.luctn.user.thrift.TUser;
import com.luctn.user.thrift.TUserService;

import java.util.List;

public class TUserHandler implements TUserService.Iface {

    @Override
    public TUser get(int i) throws TException, org.apache.thrift.TException {
        TUser user = new TUser();
        user.setStudentid(String.valueOf(i));
        user.setStudentName("Luc");
        return user;
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
