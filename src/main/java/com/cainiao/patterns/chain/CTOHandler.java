package com.cainiao.patterns.chain;

/**
 * @author vinfai
 * @since 2016/5/10
 */
public class CTOHandler extends Handler {

    Integer capacityAmount = 0 ;
    public CTOHandler(Integer maxAmount) {
        this.capacityAmount = maxAmount;
    }

    public CTOHandler() {
    }

    @Override
    protected void doChain(Integer applyAmount) {
        if(applyAmount<=capacityAmount){
            System.out.println("cto handle now. applyAmount:"+applyAmount+";capacity amount:"+this.capacityAmount);
        }else{
            System.out.println("cto can't handle.no next handler now");
            System.out.println("reject apply.");
        }
    }
}
