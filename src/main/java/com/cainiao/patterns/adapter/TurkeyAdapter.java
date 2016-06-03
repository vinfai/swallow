package com.cainiao.patterns.adapter;

/**
 * �����������ѻ�ð���Ѽ��
 * Created by vinfai on 2016/5/3.
 */
public class TurkeyAdapter implements Duck{
    /**
     * ������Ϸ�ʽ
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
        //����αװ��Ѽ�ӷ�
        for(int i=0;i<6;i++){
            this.turkey.fly();
        }
    }
}
