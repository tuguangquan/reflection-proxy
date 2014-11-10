package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-9
 * Time: 下午2:29
 * To change this template use File | Settings | File Templates.
 */
public class DynamicSubject implements InvocationHandler {
    private Object object;
    public DynamicSubject(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before:"+method);
        method.invoke(object, args);

        System.out.println("after:"+method);
        return null;
    }
}
