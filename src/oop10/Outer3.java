package oop10;

// 로컬 내부클래스

public class Outer3 {
	int x;
	static int y;
	void m1() {}
	static void m2() {}
	
	void m3() {
		
		int a = 10;
		int b = 10;
		final int c = 10;
		
		b = 20;
		
		class Inner3 {
			int 가; // 갓이 한번도 바뀌지 않았음
//			static int 나; // 클래스 변수 정의 불가
			void m4() {} // 원래 값을못 구 함
//			static void m5() {} // 클래스 메서드 정의 불가
			
			void m6() {
				System.out.println(x); // 외부 클래스의 멤버 변수
				System.out.println(y); // 외부 클래스의 클래스 변수
				m1();				   // 외부 클래스의 멤버 메서드
				Outer3.m2();		   // 외부 클래스의 클래스 메서드 
				System.out.println(a); // 내부 클래스가 정의된 메서드의 변수
//				System.out.println(b); // 내부 클래스가 정의된 메서드의 변수, 값 변하면 오류
				System.out.println(c); // 내부 클래스가 정의된 메서드의 상수
			}
			
			Inner3 i = new Inner3();
			//i.m6();
			
		}
	}
}
