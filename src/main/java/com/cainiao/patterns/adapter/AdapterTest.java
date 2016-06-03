package com.cainiao.patterns.adapter;

/**
 * 适配器模式：通过中介适配转换，使两个不能一起工作的类都能一起工作。
 * Created by vinfai on 2016/5/3.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
        duck.quack();

        //原始野鸭 00022
        Duck wildDuck = new WildDuck();
        wildDuck.quack();
        wildDuck.fly();
    }
}
