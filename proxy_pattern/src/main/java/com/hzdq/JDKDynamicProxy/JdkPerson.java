package com.hzdq.JDKDynamicProxy;

import com.hzdq.Person;

/**
 * dingqiang
 * 2019-07-06
 */
public class JdkPerson implements Person {
    @Override
    public void eatApple() {
        System.out.println("吃苹果");
    }
}
