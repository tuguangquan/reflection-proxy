package com.dynamicProxy;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-9
 * Time: 下午2:28
 * To change this template use File | Settings | File Templates.
 */
public class RealSubject implements  Subject {
    @Override
    public void request(int i) {
        System.out.println("from real subject");
    }

    @Override
    public void a(int j) {
        System.out.println("from real a");
    }
}
