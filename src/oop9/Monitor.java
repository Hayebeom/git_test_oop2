package oop9;

// 인터페이스(기획서)
// 모든 종류의 모니터가 반드시 갖춰야 하는 기능을 정의
// 모든 종류의 모니터에 대한 표준을 정의 (사용 방법의 표준)
public interface Monitor {
	
	public abstract void on();
	void off(); // public abstract void on(); 
	void display(); // public abstract 생략 가능
	
}
