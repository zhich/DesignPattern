package com.zhi.demo.templatemethod.ext;

/**
 * 场景类
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-7-20
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------H1型号悍马--------");

		HummerH1Model h1 = new HummerH1Model();
		h1.setAlarm(true);
		h1.run();

		System.out.println("\n-------H2型号悍马--------");

		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}
}
