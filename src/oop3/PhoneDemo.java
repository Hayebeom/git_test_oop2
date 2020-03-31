package oop3;
/**
 * 6
 * @author HYB
 *
 */
public class PhoneDemo {
	public static void main(String[] args) {
		
		// 형변환
		// Iphone 객체는 Iphone 타입의 변수 및 Iphone 조상 타입의 변수에 저장 가능
		Iphone p1 = new Iphone();
		SmartPhone p2 = new SmartPhone();
		FeaturePhone p3 = new FeaturePhone();
		Phone p4 = new Phone();
		
		// Galaxy p5 = new Iphone(); // Iphone 객체는 Galaxy 타입의 변수에 담을 수 없음
		
										//	클래스		사용 가능한 참조 변수
		p1.userid = "hong";				// Iphone		p1
		p1.password = "1q2w3e4r";		// Iphone		p1
		p1.applemusic();				// Iphone		p1
		p1.siri();						// Iphone		p1
		
		p1.ip = "192.168.10.21";		// SmaerPhone	p1 p2
		p1.email = "hong@gmail.com";	// SmaerPhone	p1 p2
		p1.mail();						// SmaerPhone	p1 p2
		p1.internet();					// SmaerPhone	p1 p2
		
		p1.pixel = "천만화소";				// FeaturePhone p1 p2 p3
		p1.photo();						// FeaturePhone p1 p2 p3
		
		p1.tel = "010-1111-1111";		// Phone		p1 p2 p3 p4
		p1.call();						// Phone		p1 p2 p3 p4
		p1.receive();					// Phone		p1 p2 p3 p4
		
	}
}
