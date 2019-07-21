package com.hzdq;

import com.hzdq.decorator.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Route route = new RouteDecorator(new BaseWay());
        route = new BusDecorator(route);
        route = new ShipDecorator(route);
        System.out.println(route.way());
        System.out.println(route.money()+"元");
    }
}
