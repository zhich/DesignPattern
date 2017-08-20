package com.zhi.demo.abstractfactory;

/**
 * @author zch
 * @description 人种接口
 * @created at 2017/8/20
 */
public interface Human {

	/**
	 * 每个人种都有相应的颜色
	 */
	public void getColor();

	/**
	 * 人类会说话
	 */
	public void talk();

	/**
	 * 每个人都有性别
	 */
	public void getSex();
}
