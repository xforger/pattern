package com.hzdq.abstractFactory;

/**
 * dingqiang
 * 2019-06-18
 */
public class EnglishAbstractFactory implements AbstractFactory {
    @Override
    public Tel createtel() {
        return new EnglishTel();
    }

    @Override
    public Address createAddress() {
        return new EnglishAddress();
    }
}
