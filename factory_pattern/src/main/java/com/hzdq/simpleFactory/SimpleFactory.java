package com.hzdq.simpleFactory;

/**
 * dingqiang
 * 2019-06-18
 */
public class SimpleFactory {
    public Teacher create(Class<?> cls){
        try {
            if(cls!=null) {
                return (Teacher) cls.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
