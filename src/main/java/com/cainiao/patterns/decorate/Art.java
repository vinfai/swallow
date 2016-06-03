package com.cainiao.patterns.decorate;

/**
 * concrete decorator.
 * Created by vinfai on 2016/4/28.
 */
public class Art extends GirlDecorator{

    public Art(Girl girl){
        this.girl = girl;
    }
    //保存原始对象,扩展其能力
    private Girl girl;

    @Override
    public String getDescription() {
        return this.girl.getDescription()+" Like art.";
    }

    /**
     * 装饰后新的能力
     */
    public void draw(){
        System.out.println("draw now.");
    }
}
