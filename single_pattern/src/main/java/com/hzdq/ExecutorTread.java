package com.hzdq;

import com.hzdq.lazySingleton.SimpleLazySingletonOne;

/**
 * dingqiang
 * 2019-06-26
 */
public class ExecutorTread implements Runnable {
    @Override
    public void run() {
        SimpleLazySingletonOne simpleLazySingletonOne=SimpleLazySingletonOne.getInstance();
        System.out.println(simpleLazySingletonOne);
    }
}
