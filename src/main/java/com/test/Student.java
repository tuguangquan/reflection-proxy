package com.test;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-9
 * Time: 下午5:05
 * To change this template use File | Settings | File Templates.
 */
public class Student implements Say {
    @Override
    public void sayHello() {
        System.out.println("Student sayHello");
    }

    @Override
    public void sayBye() {
        System.out.println("Student sayBye");
    }
}
