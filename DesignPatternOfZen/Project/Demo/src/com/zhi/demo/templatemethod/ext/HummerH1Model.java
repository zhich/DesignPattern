package com.zhi.demo.templatemethod.ext;

/**
 * @author zch
 * @description H1型号悍马模型
 * @created at 2017/7/20
 */
public class HummerH1Model extends HummerModel {

	private boolean alarmFlag = true; // 要响喇叭

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("悍马H1发动...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("悍马H1停车...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("悍马H1鸣笛...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("悍马H1引擎声音是这样的...");
	}

	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	/**
	 * 要不要响喇叭， 是由客户来决定的
	 * 
	 * @param isAlarm
	 */
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
}