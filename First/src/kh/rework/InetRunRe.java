package kh.rework;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRunRe {
	
	/* 네트워크 (Network) : 여러 대의 컴퓨터들이 연결되어 있는 통신망
	 * 
	 * IP 주소 : 네트워크 상에 각 컴퓨터들을 식별해주는 번호
	 * 포트(port) : 한 컴퓨터 내에 프로그램들을 식별해주는 번호
	 * 서버 : 클라이언트들에게 서비스를 제공해주는 프로그램 / 클라이언트에게 요청을 받아 처리 후 응답
	 * 클라이언트 : 서비스를 제공받는 고객 / 서버에 요청을 보내는 프로그램
	 */
	
	public static void main(String[] args) {
		// java.net.InetAddress : 네트워크 정보를 확인할 수 있는 기본 클래스
		try {
			InetAddress iNet = InetAddress.getLocalHost();
			// -> getLocalHost() : 현재 PC에 대한 네트워크 정보를 확인할 수 잇음.
			System.out.println(iNet);
			
			System.out.println("PC정보 : " + iNet.getHostName());
			System.out.println("IP정보 : " + iNet.getHostAddress());
			
			InetAddress iNet2 = InetAddress.getByName("www.naver.com");
			
			System.out.println("서버명 : " + iNet2.getHostName());
			System.out.println("서버IP 주소 : " + iNet2.getHostAddress());
			
			InetAddress[] iNet3 = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("호스트 개수 : " + iNet3.length);
			for(InetAddress n : iNet3) {
				System.out.println(n);
			}
			
		} catch (UnknownHostException e ) {
			e.printStackTrace();
		}
	}

}
