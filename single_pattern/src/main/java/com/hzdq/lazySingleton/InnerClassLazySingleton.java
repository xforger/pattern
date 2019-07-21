package com.hzdq.lazySingleton;

import java.io.Serializable;

/**
 * dingqiang
 * 2019-06-26
 */
public class InnerClassLazySingleton implements Serializable {
    private InnerClassLazySingleton() {
        if(InnerClass.innerclassLazySingleton!=null){
            throw new RuntimeException("已经有一个对象了");
        }
    }
    public static InnerClassLazySingleton getInstance(){
        return InnerClass.innerclassLazySingleton;
    }
    private static  class InnerClass{
        private static final InnerClassLazySingleton innerclassLazySingleton=new InnerClassLazySingleton();
    }
    private Object readResolve(){
        return InnerClass.innerclassLazySingleton;
    }
}
