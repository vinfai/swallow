package com.cainiao.patterns.observer;

import java.util.EventListener;

/**
 * �۲���ģʽ������1�Զ�������ϵ������״̬�������ʱ�������������󶼻��յ�֪ͨ�������Զ����¡�
 * Created by vinfai on 2016/4/29.
 */
public class ObserverTest {

    public static void main(String[] args) {
        Headhunter headhunter = new Headhunter();

        JobSeeker jobSeeker01 = new JobSeeker("jobseeker01");
        JobSeeker jobSeeker02 = new JobSeeker("jobseeker02");

        // TODO: 2016/4/29 ���ﲻ��Ӧ���� jobSeeker ����ȥע�����
        headhunter.registerObserver(jobSeeker01);
        headhunter.registerObserver(jobSeeker02);

        headhunter.receiveJob("java ����ʦ�������Ϻ����ֶ������տƼ���20K-30K");

    }
}
