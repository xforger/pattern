package com.hzdq;

import com.hzdq.abstractFactory.AbstractFactory;
import com.hzdq.abstractFactory.EnglishAbstractFactory;
import com.hzdq.abstractFactory.MathAbstractFactory;
import com.hzdq.factoryMethod.EnglishFactoryMethod;
import com.hzdq.factoryMethod.FactoryMethod;
import com.hzdq.factoryMethod.MathFactoryMethod;
import com.hzdq.simpleFactory.MathTeacher;
import com.hzdq.simpleFactory.SimpleFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        //简单工厂模式
        simpleFactory();
        //工厂方法
        factoryMethod();
        //抽象工厂
        abstractFactory();
    }
    public static void simpleFactory(){
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.create(MathTeacher.class).teacherTel();
    }
    public static void factoryMethod(){
        FactoryMethod factoryMethod = new MathFactoryMethod();
        factoryMethod.create().TeacerTel();
        factoryMethod = new EnglishFactoryMethod();
        factoryMethod.create().TeacerTel();
    }
    public static  void  abstractFactory(){
        AbstractFactory abstractFactory = new EnglishAbstractFactory();
        abstractFactory.createAddress().teacherAddress();
        abstractFactory.createtel().teacherTel();
        abstractFactory = new MathAbstractFactory();
        abstractFactory.createtel().teacherTel();
    }
}
