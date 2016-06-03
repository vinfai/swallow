package com.cainiao.patterns.adapter;

/**
 * 火鸡适配器：把火鸡冒充成鸭子
 * Created by vinfai on 2016/5/3.
 */
public class TurkeyAdapter implements Duck{
    /**
     * 对象组合方式
     */
    public Turkey turkey ;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        //适配伪装成鸭子飞
        for(int i=0;i<6;i++){
            this.turkey.fly();
        }
    }
}
