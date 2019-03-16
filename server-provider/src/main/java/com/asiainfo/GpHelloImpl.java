package com.asiainfo;

/**
 * Created by qianminglang on 2019/3/16.
 */
public class GpHelloImpl implements IGpHello {
    @Override
    public String sayHello(String msg) {
        return "hello "+msg;
    }
}
