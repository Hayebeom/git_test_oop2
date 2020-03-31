package oop8;

public class Person {
	
	private String name;
	private String email;
	
	public Person () {
		 // super();가 숨겨져있음. super() 는  부모 클래스의 기본 생성자를 실행시킴
		 // 모든 생성자 메서드에는 부모클래스의 기본 생성자를 실행시키는 super(); 수행문이 자동으로 추가됨
		 // 개발자가 다른 super(값, 값...) 메서드를 실행시키는 수행문을 추가하면 super(); 수행문이 추가되지 않음
	}
	
	public Person (String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void printInfo() {
		System.out.println("### Person의 printInfo() ###");
		System.out.println("이름 : " + name);
		System.out.println("이메일 : " + email);
	}
	
}
