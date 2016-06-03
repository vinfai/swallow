package com.cainiao.patterns.observer;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

/**
 * 主题对象：1.维护观察者 register,remove <br/>
 *          2.通知观察者 notify <br/>
 * Created by vinfai on 2016/4/29.
 */
public class Subject {

    protected List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyAll(String source){
        EventObject evt = new EventObject(source);
        for (Observer observer:observers){
            observer.update(evt);
        }
    }
}
