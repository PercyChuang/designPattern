package com.ibeifeng.strategy;

/**
 * 指定不同的方式
 * @author PERCY
 */
public class StrategyB implements Strategy {

	public double cost(double num) {
		if(num >= 200) {
			return num - 50;
		}
		return num;
	}

}
