package com.hzdq;

import com.google.common.eventbus.EventBus;
import com.hzdq.observer.jdkObserver.Gper;
import com.hzdq.observer.jdkObserver.Question;
import com.hzdq.observer.jdkObserver.Teacher;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //jdk观察者测试
        jdkObserverTest();
        //guava观察者模式
        guavObservertest();
    }

    private static void guavObservertest() {
        EventBus eventBus = new EventBus();
        com.hzdq.observer.guava.Gper gper = new com.hzdq.observer.guava.Gper();
        com.hzdq.observer.guava.Teacher tom=new com.hzdq.observer.guava.Teacher("Tom");
        com.hzdq.observer.guava.Question question = new com.hzdq.observer.guava.Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景?");
        gper.publishQuestion(question);
        eventBus.register(tom);
        Map<String,Object> map = new HashMap<>();
        map.put(com.hzdq.observer.guava.Teacher.GPER,gper);
        map.put(com.hzdq.observer.guava.Teacher.QUESTION,question);
        eventBus.post(map);
    }

    private static void jdkObserverTest() {

        Gper gper = Gper.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        gper.addObserver(tom);
        gper.addObserver(mic);
        //业务逻辑代码
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景?");
        gper.publishQuestion(question);
    }
}
