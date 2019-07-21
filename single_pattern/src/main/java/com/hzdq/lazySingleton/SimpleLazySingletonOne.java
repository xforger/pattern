package com.hzdq.lazySingleton;

/**
 * dingqiang
 * 2019-06-26
 */
public class SimpleLazySingletonOne {
    private SimpleLazySingletonOne(){}
    private static SimpleLazySingletonOne simpleLazySingletonOne=null;
    public static SimpleLazySingletonOne getInstance(){
        if(simpleLazySingletonOne==null){
            simpleLazySingletonOne=new SimpleLazySingletonOne();
        }
        return simpleLazySingletonOne;
    }
}
