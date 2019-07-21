package com.hzdq.threadLocalSingleton;

/**
 * dingqiang
 * 2019-06-26
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalINstance = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    public static ThreadLocalSingleton getInstance(){
        return threadLocalINstance.get();
    }
}
