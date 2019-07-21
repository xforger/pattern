package com.hzdq;

import com.hzdq.strategy.Route;
import com.hzdq.strategy.RouteStrategy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Route route = RouteStrategy.getInstance(RouteStrategy.CAR_WAY);
        if (route != null) {
            route.way();
        }
    }
}
