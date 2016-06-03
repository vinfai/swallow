package com.cainiao.spi;

/**
 * spi 具体实现，
 * @author vinfai
 * @since 2016/5/4
 */
public class CarMoveSpi implements MoveSpi {
    @Override
    public String doMove() {
        return "move by car";
    }

}
