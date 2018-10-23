package com.beidahuang.main;

import com.beidahuang.hello.Hello;
import com.beidahuang.hello.impl.HelloImpl;
import com.beidahuang.register.impl.RegisterImpl;
import com.beidahuang.rpcServer.RpcServer;
import com.beidahuang.user.User;
import com.beidahuang.user.impl.UserImpl;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class ServerMain {

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {


        Hello hello = new HelloImpl();
        User user = new UserImpl();
        //发布接口

        RegisterImpl register = new RegisterImpl();

        RpcServer rpcServer = new RpcServer(register,"localhost:8080");

        rpcServer.bind(hello,user);
        rpcServer.registetrAndListener();

    }
}
