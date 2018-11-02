package com.beidahuang.main;

import com.beidahuang.hello.Hello;
import com.beidahuang.hello.impl.HelloImpl;
import com.beidahuang.register.impl.RegisterImpl;
import com.beidahuang.user.User;
import com.beidahuang.user.impl.UserImpl;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ServerMain {

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[] {"META-INF/dubbo-provider.xml"});



    }
}
