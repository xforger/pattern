package com.hzdq;

import com.hzdq.adapter.Money;
import com.hzdq.adapter.MoneyAdapter;
import com.hzdq.adapter.Son;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Money money = new MoneyAdapter(new Son());
        int i=money.giveMoney(188);
        System.out.println(i);
    }
}
