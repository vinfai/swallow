package com.cainiao.patterns.observer;

import java.util.EventObject;

/**
 * �۲��߶���ӿ�
 * Created by vinfai on 2016/4/29.
 */
public interface Observer {

    /**
     * ���յ�֪ͨ�����¼�
     * @param evt ���յ���Ϣ���ݣ��¼�Դ
     */
    void update(EventObject evt);
}
