package com.kh.phone.controller;

import java.io.File;
import java.io.IOException;

import com.kh.phone.model.dao.PhoneDAO;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneController {
	
	private PhoneDAO pad = new PhoneDAO();
	
	public void makeFile() {
		File ff = new File("PhoneList.txt");
		if(!ff.exists()) {
			try {
				ff.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileSave(PhoneBook[] pArr) {
		
		pad.fileSave(pArr);
		
	}
	
	public PhoneBook[] fileRead() {
		return pad.fileRead();
	}

}
