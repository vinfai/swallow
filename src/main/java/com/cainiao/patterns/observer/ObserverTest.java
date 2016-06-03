package com.cainiao.patterns.observer;

import java.util.EventListener;

/**
 * 观察者模式：存在1对多依赖关系，对象状态发生变更时，所以依赖对象都会收到通知，并且自动更新。
 * Created by vinfai on 2016/4/29.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Headhunter headhunter = new Headhunter();

        JobSeeker jobSeeker01 = new JobSeeker("jobseeker01");
        JobSeeker jobSeeker02 = new JobSeeker("jobseeker02");

        // TODO: 2016/4/29 这里不是应该由 jobSeeker 主动去注册的吗？
        headhunter.registerObserver(jobSeeker01);
        headhunter.registerObserver(jobSeeker02);

        headhunter.receiveJob("java 工程师工作，上海，浦东，艾普科技，20K-30K");

    }
}
