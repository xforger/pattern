package com.hzdq.lazySingleton;

/**
 * dingqiang
 * 2019-06-26
 */
public class SimpleLazySingletonTwo {
    private SimpleLazySingletonTwo(){}
    private static SimpleLazySingletonTwo simpleLazySingletonTwo=null;
    public static synchronized SimpleLazySingletonTwo getInstance(){
        if(simpleLazySingletonTwo==null){
            simpleLazySingletonTwo=new SimpleLazySingletonTwo();
        }
        return simpleLazySingletonTwo;
    }
}
