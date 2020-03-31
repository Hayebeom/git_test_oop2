package oop2;

public class Contact {
	
	String name;
	String tel;
	String email;
	
	Contact() {
		
	}
	
	Contact(String name, String tel) {
		this(name, tel, null);
	}
	
	Contact(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	// Object로부터 상속받은 toString() 메서드를 재정의
	// "클래스이름@해시코드" 를 반환하도록 구현된 Object의 toString() 메서드를
	// Contact 객체의 name, tel, email 멤버변수의 현재 저장된 값이 문자열로 이어서 반환되도록 재정의
	// 마우스 우클릭 - Source - generate toString 
	@Override
	public String toString() {
		return "Contact [name=" + name + ", tel=" + tel + ", email=" + email + "]";
	}
	
}