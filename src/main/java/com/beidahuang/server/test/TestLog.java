package com.beidahuang.server.test;

import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;

public class TestLog {

    public static void main(String[] args) {

       InternalLogger logger = InternalLoggerFactory.getInstance(TestLog.class);

        try{
            int i = 0 /0;
        }catch (Exception e) {

            logger.error(e.getMessage());
        }
    }

}
