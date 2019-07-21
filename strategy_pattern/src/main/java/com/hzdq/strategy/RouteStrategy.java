package com.hzdq.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * dingqiang
 * 2019-07-21
 */
public class RouteStrategy {
    public static final String FOOT_WAY="Foot";
    public static final String CAR_WAY="Car";
    private static Map<String,Route> map = new HashMap<>();
    static{
        map.put(FOOT_WAY,new ByFoot());
        map.put(CAR_WAY,new ByCar());
    }
    public static Route getInstance(String key){
        if(map.containsKey(key)) {
            return map.get(key);
        }else{
            return null;
        }
    }
}
