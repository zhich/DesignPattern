package com.zhi.demo.builder;

/**
 * 宝马模型
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-9-21
 */
public class BMWModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马车跑起来是这个样子的...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马车应该这样停车...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马车的喇叭声音是这个样子的...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马车的引擎是这个声音的...");
	}
}
