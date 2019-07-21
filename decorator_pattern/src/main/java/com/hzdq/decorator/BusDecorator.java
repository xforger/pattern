package com.hzdq.decorator;

/**
 * dingqiang
 * 2019-07-21
 */
public class BusDecorator extends RouteDecorator {

    public BusDecorator(Route route) {
        super(route);
    }
    @Override
    public String way() {
        return super.way()+"加坐公交";
    }

    @Override
    public int money() {
        return super.money()+7;
    }
}
