package com.hzdq.observer.jdkObserver;

import java.util.Observable;

/**
 * dingqiang
 * 2019-07-21
 */
public class Gper extends Observable {
    public Gper() {
    }
    private String name="生态圈";
    private static Gper gper=null;
    public static Gper getInstance(){
        if(null==gper){
            gper=new Gper();
        }
        return  gper;
    }
    public String getName(){
        return name;
    }
    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
