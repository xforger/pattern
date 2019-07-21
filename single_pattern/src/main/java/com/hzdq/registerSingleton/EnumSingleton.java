package com.hzdq.registerSingleton;

/**
 * dingqiang
 * 2019-06-26
 */
public enum EnumSingleton {
    INSTANCE;
    private Object object;
    public Object getData(){
        return object;
    }
    public void setData(Object obj){
        object=obj;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}