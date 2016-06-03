package com.cainiao.patterns.decorate;

/**
 * concrete decorator.
 * Created by vinfai on 2016/4/28.
 */
public class Art extends GirlDecorator{

    public Art(Girl girl){
        this.girl = girl;
    }
    //����ԭʼ����,��չ������
    private Girl girl;

    @Override
    public String getDescription() {
        return this.girl.getDescription()+" Like art.";
    }

    /**
     * װ�κ��µ�����
     */
    public void draw(){
        System.out.println("draw now.");
    }
}
