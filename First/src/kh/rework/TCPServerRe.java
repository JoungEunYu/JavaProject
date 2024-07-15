package kh.rework;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServerRe {
	
	/*
	 * TCP : 서버와 클라이언트의 1:1 통신 : 데이터 교환전 서버와 클라이언트가 연결되어야 함.
	 * 연결 전에는 서버가 먼저 실행
	 * 
	 * 소켓 : 네트워크 상 통신할 때 통로 역할 Input/OutputStream을 가지고 있음
	 * ServerSocket : 설정된 포트로 프로그램이 실행되어 외부의 연결 요청을 대기하다가 요청이 들어오면 수락
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader stream = null;
		PrintWriter pw = null;
		ServerSocket server = null;
		
		// 1) 포트 번호 정의
		int port = 3000;
		
		// 2) 서버용 소켓 객체 생성 (ServerSocket)
		try {
			server = new ServerSocket(port);
			// ---- 클라이언트 요청 대기 -----
			System.out.println("----- 요청 대기중 ----");
			
			// 3) 연결 요청 시 수락 후 해당 클라이언트와의 통신 준비 (Socket 객체 생성)
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + )
			
		}
		
		
		
	}

}
