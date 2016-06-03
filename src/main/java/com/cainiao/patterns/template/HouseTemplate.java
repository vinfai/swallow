package com.cainiao.patterns.template;

/**
 * 基本模板方法:
 * 
 * @author Administrator
 *
 */
public abstract class HouseTemplate {
	
	/**
	 * 1.final 避免子类覆盖
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
	 * 创建地基
	 */
	public void buildFoundation(){
		System.out.println("build foundation...");
	}
	
	/**
	 * 造墙
	 */
	public abstract void buildWalls();
	/**
	 * 支架
	 */
	public abstract void buildPillars();
	
	
	public void buildWindow(){
		System.out.println("build windows...");
	}
	/**
	 * hook 方法，子类可实现，也可不实现
	 * 可粉刷也可不粉刷
	 */
	public void whiteWash(){
		
	}
}
