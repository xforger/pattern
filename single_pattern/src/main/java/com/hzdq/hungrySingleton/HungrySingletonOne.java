package com.hzdq.hungrySingleton;

/**
 * dingqiang
 * 2019-06-26
 */
public class HungrySingletonOne {
    private HungrySingletonOne(){}
    private static final HungrySingletonOne hungrySingletonOne=new HungrySingletonOne();
    public static HungrySingletonOne getInstance(){
        return hungrySingletonOne;
    }

}
