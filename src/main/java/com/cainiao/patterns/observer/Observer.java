package com.cainiao.patterns.observer;

import java.util.EventObject;

/**
 * 观察者对象接口
 * Created by vinfai on 2016/4/29.
 */
public interface Observer {

    /**
     * 接收到通知处理事件
     * @param evt 接收的消息内容，事件源
     */
    void update(EventObject evt);
}
