package com.hzdq.CglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * dingqiang
 * 2019-07-06
 */
public class CglibDynamicProxy implements MethodInterceptor {
    public Object getInstance(Class<?> cls){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object o1=methodProxy.invokeSuper(o,objects);
        after();
        return o1;
    }
    private void before(){
        System.out.println("前置方法");
    }
    private void after(){
        System.out.println("后置方法");
    }
}
