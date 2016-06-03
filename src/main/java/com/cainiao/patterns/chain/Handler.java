package com.cainiao.patterns.chain;

/**
 * @author vinfai
 * @since 2016/5/9
 */
public abstract class Handler {

    /**
     * ºó¼Ì
     */
    protected Handler nextHandler ;

    protected abstract void doChain(Integer applyAmount);

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
