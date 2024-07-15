package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		System.out.println(d.information());
		
		Desktop d2 = new Desktop("삼성", "SS-01", "삼성데스크탑", 200, true);
		System.out.println(d2.information());
		
		SmartPhone s = new SmartPhone("애플", "I-28", "IPhone28", 290, "모바일대행사");
		System.out.println(s.information());
		
		Tv t = new Tv("Pavv", "pv-1100", "P2P", 20, 42);
		System.out.println(t.information());
	}

}
