package com.zhi.demo.abstractfactory;

/**
 * @author zch
 * @description 白色人种抽象类
 * @created at 2017/8/20
 */
public abstract class AbstractWhiteHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("白色人种的皮肤颜色是白色的！ ");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("白色人种会说话， 一般说的都是单字节。 ");
	}
}
