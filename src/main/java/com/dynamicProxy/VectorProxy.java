package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-9
 * Time: 下午3:56
 * To change this template use File | Settings | File Templates.
 */
public class VectorProxy implements InvocationHandler {
    private  Object objectProxy;
    public VectorProxy(Object object){
        this.objectProxy=object;
    }
    public static  Object factory(Object object){
        Class<?> classType = object.getClass();
        //传递进来的是Vector实例，而Vector实现了List的接口，这里返回的实例就应该是实现了List的代理实例接口
        return Proxy.newProxyInstance(classType.getClassLoader(),classType.getInterfaces(),new VectorProxy(object));
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println("before::"+method);
        if(null!=args){
             for(Object o:args){
                 System.out.println(o);
             }
        }
        Object object= method.invoke(objectProxy,args);

        System.out.println("after:"+method);
        return object;
    }
    public static void main(String[] args){
        //  Vector实现了List接口，这里的v是动态生成的代理实例，
        // 所以在调用这个实例里面的方法都会被代理
        List v=(List)factory((new Vector()));
        v.add("New");
        v.add("York");
        v.clear();
    }
}
