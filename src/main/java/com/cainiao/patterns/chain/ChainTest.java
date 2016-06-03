package com.cainiao.patterns.chain;

/**
 * 责任链模式：行为模式。发出请求后，有handler链条（多个handler）接收到请求，每个handler根据自己的职责判断是否处理改请求，还是转发给其他handler来处理.
 * 责任链模式是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。请求在这个链上传递，直到链上的某一个对象决定处理此请求。
 * 发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。
 * if elseif else 的另外一种实现？
 * 关键：链条,传递请求
 * @author vinfai
 * @since 2016/5/6
 */
public class ChainTest {

    public static void main(String[] args) {
        // TODO: 2016/5/10  如何维护链表 
        ChargeManHandler chargeManHandler = new ChargeManHandler(200);
        PMHandler pmHandler = new PMHandler(500);
        CTOHandler ctoHandler = new CTOHandler(1000);
        chargeManHandler.setNextHandler(pmHandler);
        pmHandler.setNextHandler(ctoHandler);
        ctoHandler.setNextHandler(null);

        //开始申请
        int applyAmount = 600;
        //提交给上一级,组长
        chargeManHandler.doChain(applyAmount);

    }
}
