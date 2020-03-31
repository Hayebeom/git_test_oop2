package oop1;

public class TvDemo2 {
	
	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		IPTv tv2 = new IPTv();
		NetflixTv tv3 = new NetflixTv();
		NetflixTv tv4 = new NetflixTv();
		
		// Object에 정의된 toString 메서드 사용
		// toString() : "클래스 전체 이름@해시코드" 로 구성된 문자열을 반환하는 메서드
		String desc1 = tv1.toString();
		String desc2 = tv2.toString();
		String desc3 = tv3.toString();
		String desc4 = tv4.toString();
		
		System.out.println();
		
		System.out.println(desc1);
		System.out.println(desc2);
		System.out.println(desc3);
		System.out.println(desc4);
		
		System.out.println();
		
		// 자바는 참조변수의 값을 출력해볼 수 없음
		// 참조변수의 값을 출력하는 대신, 참조변수가 참조하는 객체의 toString()을 실행
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(tv3);
		System.out.println(tv4);
		
		System.out.println();
		
		System.out.println(tv1.toString());
		System.out.println(tv2.toString());
		System.out.println(tv3.toString());
		System.out.println(tv4.toString());
		
	}
	
}
