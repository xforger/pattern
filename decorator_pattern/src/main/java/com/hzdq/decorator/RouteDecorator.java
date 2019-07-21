package com.hzdq.decorator;

/**
 * dingqiang
 * 2019-07-21
 */
public class RouteDecorator implements Route{
    private Route route;

    public RouteDecorator(Route route) {
        this.route = route;
    }

    @Override
    public String way() {
        return route.way();
    }

    @Override
    public int money() {
        return route.money();
    }
}
