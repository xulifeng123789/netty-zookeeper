package com.beidahuang.user.impl;

import com.beidahuang.annotation.RpcService;
import com.beidahuang.user.User;

import java.util.ArrayList;
import java.util.List;

@RpcService(User.class)
public class UserImpl implements User {

    public List<String> findUserNameById(Long id) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        return list;
    }
}
