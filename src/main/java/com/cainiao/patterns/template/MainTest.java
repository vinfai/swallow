package com.cainiao.patterns.template;

/**
 * 模板模式：一些子类的功能有可能提取的公共算法骨架。
 *
 */
public class MainTest {

	public static void main(String[] args) {

		HouseTemplate whTemplate = new WoodHouseTemplate();
		HouseTemplate glassTemplate = new GlassHouseTemplate();

		whTemplate.buildHouse();
		glassTemplate.buildHouse();


		/*Double a = 92428179.5d;
		Double b = 107414320d;
		BigDecimal a1 = new BigDecimal(a);
		BigDecimal b1 = new BigDecimal(b);
		Double c = new Double(a1.subtract(b1)+"");
		System.out.println(a-b);
		System.out.println(a1.subtract(b1));
		System.out.println(a1.subtract(b1).doubleValue());*/
	}
}
