package oop9;

public class NormalTv {
	
	private Monitor monitor; // Monitor 타입의 객체를 담는 멤버변수
	
	public NormalTv(Monitor monitor) { // 생성자 실행할 때 Monitor를 구현한 객체만을 전달받음
		this.monitor = monitor; // NormalMonitor, HDMonitor, CinemaMonitor, LCDCinemaMoitor만을 전달받음
	}
	
	public void watch() {
		// Monitor 인터페이스를 기준으로 프로그램을 작성
		monitor.on();	// Monitor 인터페이스에 추상화된 기능을 사용
		monitor.display(); // Monitor 인터페이스에 추상화된 기능을 사용
		
		// monitor.display() 실행 시 
		// 실제 멤버변수에 조립된 객체가 NormalMonitor일 때 // 컬러로 동영상 재생
		//  	 	  		  HDMonitor일 때	 // 4K 화질로 동영상 재생
		//					  CinemaMonitor일 때 // 100인치 화면에서 동영상 재생
		//					  LCDCMonitor일 때 // 터치 가능한 100인치 화면에서 동영상 재생
		/*
		★ 다형성 (polymorphism)
		 1. 조상 타입의 참조변수로 여러가지 형태의 자손타입 객체를 참조 가능
		 2. 실행하는 메서드는 동일하지만, 조상 타입의 참조 변수에 실제로 조립된 객체의 재정의(오버라이딩)된 내용 실행
		 	: 실행하는 메서드 동일, 실제 조립된 객체에 따라 다른 실행결과 발현됨
		 */
		System.out.println(""); 
	}
	
}
