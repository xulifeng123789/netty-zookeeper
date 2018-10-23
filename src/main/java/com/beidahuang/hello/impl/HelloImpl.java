package com.beidahuang.hello.impl;

import com.beidahuang.annotation.RpcService;
import com.beidahuang.hello.Hello;

@RpcService(Hello.class)
public class HelloImpl implements Hello {

    public String sayHello(String name) {
        return "hello "  + name;
    }
}
