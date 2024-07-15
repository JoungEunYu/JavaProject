package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	
	
	private String maker;
	
	public SmartPhone() {
		
	};
	// 추상 메소드 총 6개 (CellPhone - 4개, TouchDiplay - 1개, SmartPhone- 1개)
	
	public abstract String printInformation();
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
	
	
	
	

}
