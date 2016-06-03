package com.cainiao.patterns.observer;

import java.util.EventObject;

/**
 * 观察者对象
 * Created by vinfai on 2016/4/29.
 */
public class JobSeeker implements Observer{

    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(EventObject evt) {
        System.out.println(name+"接收到猎头推送的消息："+evt.getSource());
    }
}
