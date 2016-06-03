package com.cainiao.patterns.chain;

/**
 * ������ģʽ����Ϊģʽ�������������handler���������handler�����յ�����ÿ��handler�����Լ���ְ���ж��Ƿ�������󣬻���ת��������handler������.
 * ������ģʽ��һ�ֶ������Ϊģʽ����������ģʽ��ܶ������ÿһ����������¼ҵ����ö����������γ�һ������������������ϴ��ݣ�ֱ�����ϵ�ĳһ������������������
 * �����������Ŀͻ��˲���֪�����ϵ���һ���������մ������������ʹ��ϵͳ�����ڲ�Ӱ��ͻ��˵�����¶�̬��������֯�ͷ������Ρ�
 * if elseif else ������һ��ʵ�֣�
 * �ؼ�������,��������
 * @author vinfai
 * @since 2016/5/6
 */
public class ChainTest {

    public static void main(String[] args) {
        // TODO: 2016/5/10  ���ά������ 
        ChargeManHandler chargeManHandler = new ChargeManHandler(200);
        PMHandler pmHandler = new PMHandler(500);
        CTOHandler ctoHandler = new CTOHandler(1000);
        chargeManHandler.setNextHandler(pmHandler);
        pmHandler.setNextHandler(ctoHandler);
        ctoHandler.setNextHandler(null);

        //��ʼ����
        int applyAmount = 600;
        //�ύ����һ��,�鳤
        chargeManHandler.doChain(applyAmount);

    }
}
