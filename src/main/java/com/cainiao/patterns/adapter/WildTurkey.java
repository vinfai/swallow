package com.cainiao.patterns.adapter;

/**
 * Ò°»ð¼¦
 * Created by vinfai on 2016/5/3.
 */
public class WildTurkey implements Turkey{
    @Override
    public void fly() {
        System.out.println("wild turkey fly..");
    }

    @Override
    public void gobble() {
        System.out.println("wild turkey gobble.");
    }
}
