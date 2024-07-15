package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String code, String name, int price, boolean allInOne)
	{
		super(brand, code, name, price);
		this.allInOne = allInOne;
	}
	
	public String information() {
		
		return super.information() + " / allInOne = "  + allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

}
