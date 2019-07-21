package com.hzdq.registerSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * dingqiang
 * 2019-06-26
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static final ContainerSingleton conRainerSingleton=null;
    private static Map<String,Object> map = new ConcurrentHashMap<>();
    public static Object getBean(String className){
        synchronized (map) {
            if (!map.containsKey(className)) {
                Object o=null;
                try {
                    o = Class.forName(className).newInstance();
                    map.put(className, o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return o;
            } else {
                return map.get(className);
            }
        }
    }
}
