package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera {
	
	public abstract String charge();
	
	// 상수 : 1개 (phone.NUMBERPAD)
	// 추상 메소드 : 4개 (Phone - 2개 (makeAcll/takeCall)
	// 				 (Camera - 1개 (picture)
	//			     (CellPhone - 1개 (charge)

}
