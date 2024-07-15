package com.kh.example.practice6.run;
import com.kh.example.practice6.model.vo.Book;
public class Run {

	public static void main(String[] args) {
		
		Book B = new Book();
		Book b = new Book("누가 내 머리에 똥을 올렸어", "떠니출판사", "최서은", 5000000, 0.1);
		Book bb = new Book("떠니는 못말려", "떠떠니출판사", "최떠니");
		
		B.inform();
		b.inform();
		bb.inform();
	}

}
