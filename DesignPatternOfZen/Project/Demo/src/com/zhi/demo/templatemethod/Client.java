package com.zhi.demo.templatemethod;

/**
 * @author zch
 * @description 场景类
 * @created at 2017/7/20
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// XX公司要H1型号的悍马
		HummerModel h1 = new HummerH1Model();
		// H1模型演示
		h1.run();
	}
}