package com.zhi.demo.abstractfactory;

/**
 * @author zch
 * @description 八卦炉接口定义
 * @created at 2017/8/20
 */
public interface HumanFactory {
	
	// 制造一个黄色人种
	public Human createYellowHuman();

	// 制造一个白色人种
	public Human createWhiteHuman();

	// 制造一个黑色人种
	public Human createBlackHuman();
}
