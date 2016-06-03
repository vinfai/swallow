package com.cainiao.patterns.singleton;

/**
 * holderģʽ����̬�ڲ���
 * @author vinfai
 *
 */
public class HolderSingleton {

	private static class SingletonHolder{
		private static HolderSingleton instance = new HolderSingleton();
	}
	
	//���췽��˽�л�
	private HolderSingleton(){
		
	}
	
	public static HolderSingleton getInstance(){
		return SingletonHolder.instance;
	}
	
}
