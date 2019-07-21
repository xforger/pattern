package com.hzdq.imitateJdkDynamicProxy;

import java.lang.reflect.Method;

/**
 * dingqiang
 * 2019-07-07
 */
public interface ImitateInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
