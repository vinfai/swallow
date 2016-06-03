package com.cainiao.patterns.chain;

/**
 * @author vinfai
 * @since 2016/5/10
 */
public class ChargeManHandler extends Handler {
    public ChargeManHandler() {
    }
    Integer capacityAmount = 0 ;
    public ChargeManHandler(Integer maxAmount) {
        this.capacityAmount = maxAmount;
    }

    @Override
    protected void doChain(Integer applyAmount) {
        if(applyAmount<=capacityAmount){
            System.out.println("ChargeManHandler handle now. applyAmount:"+applyAmount+";capacity amount:"+this.capacityAmount);
        }else{
            System.out.println("ChargeMan can't handle. go to next handler.");
            nextHandler.doChain(applyAmount);
        }
    }
}
