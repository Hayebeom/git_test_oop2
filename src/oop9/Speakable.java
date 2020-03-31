package oop9;

// 인터페이스 기획서
// 사운드 출력이 지원되는 모든 모니터가 갖춰애 하는 기능 정의
// 사운드 출력이 지원되는 모든 모니터는 최소, 최대 범위내의 소리 크기만을 가지도록 상수 정의
public interface Speakable {
	public static final int MIN_VOLUMN = 0; // 상수
	public static final int MAX_VOLUMN = 100; // 상수
	
	void sound();
	void volumeUp();
	void volumeDown();
	
}
