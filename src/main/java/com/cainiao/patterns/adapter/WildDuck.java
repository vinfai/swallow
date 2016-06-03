package com.cainiao.patterns.adapter;

/**
 * Ò°Ñ¼×Ó
 * Created by vinfai on 2016/5/3.
 */
public class WildDuck implements Duck {
    /**
     * ¸Â¸Â½Ð
     */
    @Override
    public void quack() {
        System.out.println("wild duck quack.");
    }

    /**
     * Ñ¼×Ó·É
     */
    @Override
    public void fly() {
        System.out.println("wild duck fly.");
    }
}
