package com.cainiao.spi;

/**
 * Move spi ������ʵ��
 * @author vinfai
 * @since 2016/5/4
 */
public class WalkMoveSpi implements MoveSpi {
    @Override
    public String doMove() {
        return "move by walk way.";
    }
}
