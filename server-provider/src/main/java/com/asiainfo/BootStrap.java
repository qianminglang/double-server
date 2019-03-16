package com.asiainfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by qianminglang on 2019/3/16.
 */
public class BootStrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cac=new ClassPathXmlApplicationContext("dubbo-server.xml");
        cac.start();
        System.in.read();//阻塞当前进程
    }
}
