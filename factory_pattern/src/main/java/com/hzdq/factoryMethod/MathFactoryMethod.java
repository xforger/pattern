package com.hzdq.factoryMethod;

/**
 * dingqiang
 * 2019-06-18
 */
public class MathFactoryMethod implements FactoryMethod {

    @Override
    public Teacher create() {
        return new MathTeacher();
    }
}
