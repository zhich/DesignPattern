package com.zhi.demo.builder;

import java.util.ArrayList;

/**
 * 宝马车组装者
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-9-21
 */
public class BMWBuilder extends CarBuilder {

	private BMWModel bmw = new BMWModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.bmw.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.bmw;
	}
}
