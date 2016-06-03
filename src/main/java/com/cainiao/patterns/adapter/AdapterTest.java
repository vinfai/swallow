package com.cainiao.patterns.adapter;

/**
 * ������ģʽ��ͨ���н�����ת����ʹ��������һ�������඼��һ������
 * Created by vinfai on 2016/5/3.
 */
public class AdapterTest {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.fly();
        duck.quack();

        //ԭʼҰѼ 00022
        Duck wildDuck = new WildDuck();
        wildDuck.quack();
        wildDuck.fly();
    }
}
