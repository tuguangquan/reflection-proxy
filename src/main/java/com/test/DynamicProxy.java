package com.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-9
 * Time: 下午5:06
 * To change this template use File | Settings | File Templates.
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public DynamicProxy(Object object){
        this.object = object;
    }

    public DynamicProxy(){

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("adsafdasn    "+method.getDeclaringClass()+  "  "+Object.class.equals(toString().getClass()));
        method.invoke(object,args);
        return object;
    }
}
