package com.zhi.demo.builder;

import java.util.ArrayList;

/**
 * 奔驰车组装者
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-9-21
 */
public class BenzBuilder extends CarBuilder {

	private BenzModel benz = new BenzModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;
	}
}
