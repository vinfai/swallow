package com.cainiao.patterns.template;

public class GlassHouseTemplate extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("build glass house walls...");
	}

	@Override
	public void buildPillars() {
		System.out.println("build glass house pillars...");
	}
	
	@Override
	public void whiteWash(){
		System.out.println("white wash the glass house...");
	}
}
