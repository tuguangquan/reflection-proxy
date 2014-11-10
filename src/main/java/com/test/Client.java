package com.test;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-9
 * Time: 下午5:10
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args){
        SayManager hander=new SayManager();
        hander.sayBye();
    }
}
