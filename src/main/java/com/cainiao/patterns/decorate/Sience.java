package com.cainiao.patterns.decorate;

/**
 * Created by vinfai on 2016/4/28.
 *
 */
public class Sience extends GirlDecorator{
    private  Girl girl;

    public Sience(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String getDescription() {
        return this.girl.getDescription()+" like sience.";
    }

    public void doSinence(){
        System.out.println("do sinence caluate!");
    }
}
