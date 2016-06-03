package com.cainiao.patterns.template;

/**
 * ����ģ�巽��:
 * 
 * @author Administrator
 *
 */
public abstract class HouseTemplate {
	
	/**
	 * 1.final �������า��
	 * 2.
	 */
	public final void buildHouse(){
		buildFoundation();
		buildPillars();//abstract
		buildWalls();//abstract
		buildWindow();
		whiteWash();//hook
	}
	
	/**
	 * �����ػ�
	 */
	public void buildFoundation(){
		System.out.println("build foundation...");
	}
	
	/**
	 * ��ǽ
	 */
	public abstract void buildWalls();
	/**
	 * ֧��
	 */
	public abstract void buildPillars();
	
	
	public void buildWindow(){
		System.out.println("build windows...");
	}
	/**
	 * hook �����������ʵ�֣�Ҳ�ɲ�ʵ��
	 * �ɷ�ˢҲ�ɲ���ˢ
	 */
	public void whiteWash(){
		
	}
}
