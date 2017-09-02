package com.zhi.demo.abstractfactory;

/**
 * 八卦炉接口定义
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-8-20
 */
public interface HumanFactory {
	
	// 制造一个黄色人种
	public Human createYellowHuman();

	// 制造一个白色人种
	public Human createWhiteHuman();

	// 制造一个黑色人种
	public Human createBlackHuman();
}
