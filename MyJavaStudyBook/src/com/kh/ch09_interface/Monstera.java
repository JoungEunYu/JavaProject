package com.kh.ch09_interface;

public class Monstera extends Plant {
	
	public Monstera(String name) {
		this.name = name;
	}
	
	@Override
	public void sprinkleWater() {
		// nutrients의 값을 10 증가
		setNutrients(getNutrients() + 10);
	}
	
	@Override
	public void baskSun() {
		// nutrients의 값을 20 증가
		setNutrients(getNutrients() + 20);
	}
	
	public String toString() {
		return "name은 " + name + ", nutrients = " + getNutrients();
	}
}
