package com.cainiao.patterns.chain;

/**
 * @author vinfai
 * @since 2016/5/10
 */
public class PMHandler extends Handler {
    Integer capacityAmount = 0 ;
    public PMHandler(Integer maxAmount) {
        this.capacityAmount = maxAmount;
    }

    public PMHandler() {
    }

    @Override
    protected void doChain(Integer applyAmount) {
        if(applyAmount<=capacityAmount){
            System.out.println("project manager handle now. applyAmount:"+applyAmount+";capacity amount:"+this.capacityAmount);
        }else{
            System.out.println("pm can't handle. go to next handler.");
            nextHandler.doChain(applyAmount);
        }
    }
}
