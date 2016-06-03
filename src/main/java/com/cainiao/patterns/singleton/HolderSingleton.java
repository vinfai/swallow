package com.cainiao.patterns.singleton;

/**
 * holder模式，静态内部类
 * @author vinfai
 *
 */
public class HolderSingleton {

	private static class SingletonHolder{
		private static HolderSingleton instance = new HolderSingleton();
	}
	
	//构造方法私有化
	private HolderSingleton(){
		
	}
	
	public static HolderSingleton getInstance(){
		return SingletonHolder.instance;
	}
	
}
