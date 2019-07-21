package com.hzdq.factoryMethod;

/**
 * dingqiang
 * 2019-06-18
 */
public class EnglishFactoryMethod implements  FactoryMethod {
    @Override
    public Teacher create() {
        return new EnglishTeacher();
    }
}
