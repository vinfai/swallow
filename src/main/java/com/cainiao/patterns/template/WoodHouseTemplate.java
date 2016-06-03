package com.cainiao.patterns.template;

public class WoodHouseTemplate extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("build woods walls...");
	}

	@Override
	public void buildPillars() {
		System.out.println("build woods pillars...");
	}
	
}
