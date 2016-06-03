package com.cainiao.spi;

import java.util.ServiceLoader;

/**
 * ͨ��META-INF��services/�ӿ�����
 * ����Ϊ����ʵ���࣬����׼ȷ���������
 * Created by vinfai on 2016/5/4.
 */
public class SpiTest {

    public static void main(String[] args) {
        ServiceLoader<MoveSpi> loader = ServiceLoader.load(MoveSpi.class);

        for(MoveSpi spi : loader){
            doPrint(spi);
        }
    }

    //shift+alt+M �ع�

    private static void doPrint(MoveSpi spi) {
        System.out.println(spi.getClass().getCanonicalName());
        System.out.println(spi.doMove());
    }
}
