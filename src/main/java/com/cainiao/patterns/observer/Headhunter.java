package com.cainiao.patterns.observer;

/**
 * �������⣺���۲�Ķ�����ͷ
 * Created by vinfai on 2016/4/29.
 */
public class Headhunter extends  Subject{

    public void receiveJob(String job){
        System.out.println("i receive a job."+job);
        //��һ�����������ˣ��Ǳ��Ҿ�����֪ͨ���еĶ�����
        this.notifyAll(job);
    }
}
