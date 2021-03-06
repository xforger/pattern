package com.hzdq.imitateJdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * dingqiang
 * 2019-07-06
 */
public class ImitateJdkDynamicProxy implements ImitateInvocationHandler {
    private Object object;
    public Object getInstance(Object o){
        object=o;
        Class<?> cls = o.getClass();
        return ImitateProxy.newProxyInstance(new ImitateClassLoader(),cls.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj=method.invoke(object,args);
        after();
        return obj;
    }
    private void before(){
        System.out.println("前置方法");
    }
    private void after(){
        System.out.println("后置方法");
    }
}
