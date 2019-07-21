package com.hzdq.decorator;

/**
 * dingqiang
 * 2019-07-21
 */
public class ShipDecorator extends RouteDecorator {

    public ShipDecorator(Route route) {
        super(route);
    }
    @Override
    public String way() {
        return super.way()+"加坐轮船";
    }

    @Override
    public int money() {
        return super.money()+120;
    }
}
