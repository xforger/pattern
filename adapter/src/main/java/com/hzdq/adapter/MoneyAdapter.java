package com.hzdq.adapter;

/**
 * dingqiang
 * 2019-07-21
 */
public class MoneyAdapter implements Money{
    private Son son;

    public MoneyAdapter(Son son) {
        this.son = son;
    }

    @Override
    public int giveMoney(int num) {
        if(num>=son.giveMoney()){
            return son.giveMoney();
        }else{
            return num;
        }
    }
}
