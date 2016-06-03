package com.cainiao.spi;

import java.util.ServiceLoader;

/**
 * 通过META-INF的services/接口名称
 * 内容为具体实现类，可以准确加载相关类
 * Created by vinfai on 2016/5/4.
 */
public class SpiTest {

    public static void main(String[] args) {
        ServiceLoader<MoveSpi> loader = ServiceLoader.load(MoveSpi.class);

        for(MoveSpi spi : loader){
            doPrint(spi);
        }
    }

    //shift+alt+M 重构

    private static void doPrint(MoveSpi spi) {
        System.out.println(spi.getClass().getCanonicalName());
        System.out.println(spi.doMove());
    }
}
