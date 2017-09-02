package com.zhi.demo.abstractfactory;

/**
 * 生产男性的八卦炉
 *
 * @author zch
 * @version 1.0.0
 * @since 2017-8-20
 */
public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new MaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return new MaleBlackHuman();
	}
}
