package com.cainiao.patterns.adapter;

/**
 * ҰѼ��
 * Created by vinfai on 2016/5/3.
 */
public class WildDuck implements Duck {
    /**
     * �¸½�
     */
    @Override
    public void quack() {
        System.out.println("wild duck quack.");
    }

    /**
     * Ѽ�ӷ�
     */
    @Override
    public void fly() {
        System.out.println("wild duck fly.");
    }
}
