package oop6;

public abstract class AbstractJobTemplate {
	
	String host;
	int port;
	String userid;
	String password;
	
	void setup() {
		System.out.println("### 전처리 작업 시작 ###");
		System.out.println("데이터베이스 서버에 연결 요청");
		System.out.println("데이터베이스 연결 완료");
		System.out.println("### 전처리 작업 완료 ###");
	}
	
	void destroy() {
		System.out.println("### 후처리 작업 시작 ###");
		System.out.println("데이터베이스 서버에 연결해제 요청");
		System.out.println("데이터베이스 연결해제 완료");
		System.out.println("### 후처리 작업 완료 ###");
	}
	
	// 추상 메서드
	// 자식 클래스에 실제 구현 위임을 위해 메서드를 설계(정의, 선언)
	abstract void work();
	
	// 작업을 처리하기 위해서 순서에 맞게 메서드를 실행하는 메서드
	void run() {
		setup();
		work();
		destroy();
	}

}
