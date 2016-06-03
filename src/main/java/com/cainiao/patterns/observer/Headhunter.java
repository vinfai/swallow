package com.cainiao.patterns.observer;

/**
 * 具体主题：被观察的对象，猎头
 * Created by vinfai on 2016/4/29.
 */
public class Headhunter extends  Subject{

    public void receiveJob(String job){
        System.out.println("i receive a job."+job);
        //有一个工作机会了，那边我就主动通知所有的订阅者
        this.notifyAll(job);
    }
}
