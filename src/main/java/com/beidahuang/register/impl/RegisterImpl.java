package com.beidahuang.register.impl;

import com.beidahuang.register.IRegisterCenter;
import org.apache.zookeeper.*;

import java.io.IOException;

public class RegisterImpl implements IRegisterCenter {

    private ZooKeeper zooKeeper;
    private static final String CONNECT_STR = "localhost:2181";

    //构造函数中连接zookeeper
    public RegisterImpl() throws IOException {

         zooKeeper = new ZooKeeper(CONNECT_STR, 5000, new Watcher() {
            public void process(WatchedEvent event) {

            }
        });
    }

    public void register(String serviceName, String url) throws KeeperException, InterruptedException {

        String servicePath = "/register/" + serviceName;

        //如果为空，创建节点
       if(zooKeeper.exists(servicePath,true) == null) {

           //创建持久化节点
           zooKeeper.create(servicePath,"0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
       }
        System.out.println("serviceName创建节点成功" + serviceName);
        String addressPath = servicePath + "/" + url;
        //创建临时节点
        String addNode = zooKeeper.create(addressPath, "0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        System.out.println("serviceAddress创建成功" + addNode);
    }
}
