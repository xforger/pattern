package com.hzdq.decorator;

/**
 * dingqiang
 * 2019-07-21
 */
public class BaseWay implements Route{
    @Override
    public String way() {
        return "打的";
    }

    @Override
    public int money() {
        return 50;
    }
}
