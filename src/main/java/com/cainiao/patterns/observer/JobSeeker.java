package com.cainiao.patterns.observer;

import java.util.EventObject;

/**
 * �۲��߶���
 * Created by vinfai on 2016/4/29.
 */
public class JobSeeker implements Observer{

    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(EventObject evt) {
        System.out.println(name+"���յ���ͷ���͵���Ϣ��"+evt.getSource());
    }
}
