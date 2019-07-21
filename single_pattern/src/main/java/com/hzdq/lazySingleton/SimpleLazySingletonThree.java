package com.hzdq.lazySingleton;

/**
 * dingqiang
 * 2019-06-26
 */
public class SimpleLazySingletonThree {
    private SimpleLazySingletonThree() {
    }

    private static SimpleLazySingletonThree simpleLazySingletonThree = null;

    public static SimpleLazySingletonThree getInstance() {
        if (simpleLazySingletonThree == null) {
            synchronized (SimpleLazySingletonThree.class) {
                if (simpleLazySingletonThree == null) {
                    simpleLazySingletonThree = new SimpleLazySingletonThree();
                }
            }
        }
        return simpleLazySingletonThree;
    }
}
