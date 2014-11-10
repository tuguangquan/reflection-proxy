package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-9
 * Time: 下午5:04
 * To change this template use File | Settings | File Templates.
 */
public class Leader implements Say {
    @Override
    public void sayHello() {
        System.out.println("Leader sayHello");
    }

    @Override
    public void sayBye() {
        System.out.println("Leader sayBye");
    }
}
