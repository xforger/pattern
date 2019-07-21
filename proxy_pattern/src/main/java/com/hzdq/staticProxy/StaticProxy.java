package com.hzdq.staticProxy;

/**
 * dingqiang
 * 2019-07-06
 */
public class StaticProxy {
    private staticPerson staticPerson;
    public StaticProxy(staticPerson o) {
        staticPerson =o;
    }

    public void eatApple(){
        before();
        staticPerson.eatApple();
        after();
    }
    private void before(){
        System.out.println("削苹果");
    }
    private void after(){
        System.out.println("扔果核");
    }
}
