package com.zhi.demo.abstractfactory;

/**
 * 黑色人种抽象类
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-8-20
 */
public abstract class AbstractBlackHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("黑色人种的皮肤颜色是黑色的！ ");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("黑人会说话， 一般人听不懂。 ");
	}
}
