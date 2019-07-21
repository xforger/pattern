package com.hzdq.hungrySingleton;

/**
 * dingqiang
 * 2019-06-26
 */
public class HungrySingletonTwo {
    private HungrySingletonTwo(){}
    private static final HungrySingletonTwo hungrySingletonOne;
    static{
        hungrySingletonOne=new HungrySingletonTwo();
    }
    public static HungrySingletonTwo getInstance(){
        return hungrySingletonOne;
    }

}
