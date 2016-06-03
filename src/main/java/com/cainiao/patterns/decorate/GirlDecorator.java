package com.cainiao.patterns.decorate;

/**
 * Created by vinfai on 2016/4/28.
 * decorate for girl object
 * 继承Girl，这个装饰后的对象能调用Girl相应的方法
 */
public abstract class GirlDecorator extends Girl{

    public abstract  String getDescription();
}
