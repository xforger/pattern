package com.hzdq.observer.guava;

import com.google.common.eventbus.Subscribe;

import java.util.Map;
/**
 * dingqiang
 * 2019-07-21
 */
public class Teacher{
    private String name;
    public static String GPER="gper";
    public static String QUESTION="question";
    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Map<String,Object> map) {
        if(map.containsKey(GPER)&&map.containsKey(QUESTION)) {
            Gper gper = (Gper) map.get(GPER);
            Question question = (Question) map.get(QUESTION);
            System.out.println("===============================");
            System.out.println(name + "老师，你好!\n" +
                    "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下:\n" + question.getContent() + "\n" +
                    "提问者:" + question.getUserName());
        }
    }
}
