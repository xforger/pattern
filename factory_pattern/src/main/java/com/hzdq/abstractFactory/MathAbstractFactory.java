package com.hzdq.abstractFactory;

/**
 * dingqiang
 * 2019-06-18
 */
public class MathAbstractFactory implements AbstractFactory{
    @Override
    public Tel createtel() {
        return new MathTel();
    }

    @Override
    public Address createAddress() {
        return new MathAddress();
    }
}
