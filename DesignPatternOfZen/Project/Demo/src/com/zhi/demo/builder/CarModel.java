package com.zhi.demo.builder;

import java.util.ArrayList;

/**
 * 车辆模型的抽象类
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-9-21
 */
public abstract class CarModel {

	/**
	 * 这个参数是各个基本方法执行的顺序
	 */
	private ArrayList<String> sequence = new ArrayList<>();

	/**
	 * 启动
	 */
	protected abstract void start();

	/**
	 * 停止
	 */
	protected abstract void stop();

	/**
	 * 喇叭声
	 */
	protected abstract void alarm();

	/**
	 * 引擎会轰隆隆地响
	 */
	protected abstract void engineBoom();

	/**
	 * 把传递过来的值传递到类内
	 * 
	 * @param sequence
	 */
	public final void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	/**
	 * 模型跑动
	 */
	public final void run() {
		// 循环一边，谁在前，就先执行谁
		for (int i = 0, size = this.sequence.size(); i < size; i++) {
			String actionName = this.sequence.get(i);
			if ("start".equalsIgnoreCase(actionName)) {
				this.start(); // 启动汽车
			} else if ("stop".equalsIgnoreCase(actionName)) {
				this.stop(); // 停止汽车
			} else if ("alarm".equalsIgnoreCase(actionName)) {
				this.alarm(); // 喇叭开始叫了
			} else if ("engine boom".equalsIgnoreCase(actionName)) {
				this.engineBoom(); // 引擎开始轰鸣
			}
		}
	}
}
