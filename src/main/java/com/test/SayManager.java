package com.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: tgq
 * Date: 14-10-21
 * Time: 下午8:18
 * To change this template use File | Settings | File Templates.
 */
public class SayManager implements Say {
    public  Say say;
    public SayManager(){
      this.say=(Say) Proxy.newProxyInstance(Say.class.getClassLoader(),new Class[]{Say.class},new SayInterceptor());
    }
    @Override
    public void sayHello() {
        System.out.println("SayManager sayHello");
        say.sayHello();
    }

    @Override
    public void sayBye() {
        say.sayBye();
        System.out.println("SayManager sayHello");
    }
    private class SayInterceptor implements InvocationHandler {
        public SayInterceptor() {
            // Prevent Synthetic Access
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("adsafdasn    "+method.getDeclaringClass()+  "  "+Object.class.equals(toString().getClass()));
            Say say1=new Leader();
            method.invoke(say1,args);
            return null; //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
