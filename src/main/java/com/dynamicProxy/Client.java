package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-9
 * Time: 下午2:33
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static  void main(String[] args)
    {
        RealSubject realSubject=new RealSubject();
        InvocationHandler handler=new DynamicSubject(realSubject);
        Class<?> classType=handler.getClass();
        // 动态生成代理类（即重新生成一个类），此类看成是实现了所传入的一系列接口，这里继承了Subject的接口，所以将此类可以直接转成Subject。
        //以后调用的这个接口，就是被动态代理的接口
        Subject subject =(Subject) Proxy.newProxyInstance(classType.getClassLoader(),realSubject.getClass().getInterfaces(),handler);
        subject.request(1);  //此方法执行时，就直接转到DynamicSubject的invoke方法的执行，把 request赋值给method ，把参数赋值给args
        System.out.println(subject);
    }
}
