package com.zhi.demo.builder;

import java.util.ArrayList;

/**
 * 抽象汽车组装者
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-9-21
 */
public abstract class CarBuilder {

	/**
	 * 建造一个模型，你要给我一个顺序要求，就是组装顺序
	 * 
	 * @param sequence
	 */
	public abstract void setSequence(ArrayList<String> sequence);

	/**
	 * 设置完毕顺序后，就可以直接拿到这个车辆模型
	 * 
	 * @return
	 */
	public abstract CarModel getCarModel();
}
