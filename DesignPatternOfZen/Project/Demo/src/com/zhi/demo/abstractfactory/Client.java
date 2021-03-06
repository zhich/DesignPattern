package com.zhi.demo.abstractfactory;

/**
 * 场景类
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-8-20
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 第一条生产线， 男性生产线
		HumanFactory maleHumanFactory = new MaleFactory();
		// 第二条生产线， 女性生产线
		HumanFactory femaleHumanFactory = new FemaleFactory();

		// 生产线建立完毕， 开始生产人了:
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		System.out.println("---生产一个黄色女性---");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();

		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		System.out.println("\n---生产一个黄色男性---");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();

		/*
		 * ...... 后面继续创建
		 */
	}
}
