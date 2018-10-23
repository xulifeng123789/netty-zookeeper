package com.beidahuang.server.test;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.ACL;

import java.io.IOException;

public class TestZookeeper {

    private static final String CONNECT_STR = "localhost:2181";
    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {

        ZooKeeper zooKeeper = new ZooKeeper(CONNECT_STR, 5000, new Watcher() {
            public void process(WatchedEvent event) {
                System.out.println("xxxxx");
            }
        });
        zooKeeper.create("/node","123".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL);
        System.in.read();
    }
}
