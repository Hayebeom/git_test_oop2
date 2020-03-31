package oop8;

public class Employee extends Person {
	
	private String dept;
	private String position;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, String email, String dept, String position, int salary) {

		/*

		super() 메서드 : 부모의 생성자를 가리킴
		자식 클래스의 생성자 안에서 부모 클래스의 생성자를 실행할 때만 사용 (부모 멤버가 private라서 접근 못하거나 할때 사용)
		super() 메서드는 메서드의 첫번째 수행문으로만 사용 가능 (첫줄에만 사용)
		
		class Person { 
			String name;
 			String email;
 			
 			public Person() { // super()로 접근 가능
 			
 			}
 			
 			public Person(String name, String email) { // super(String, String)로 접근 가능
 				this.name = name;
 				this.email = email;
 			}
		}

		*/
		super(name, email);  // super() 생성자는 항상 첫번째 라인에 위치해야 함
		
		this.dept = dept;
		this.position = position;
		this.salary = salary;
		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("### Employee의 printInfo() ###");
		System.out.println("부서 : " + dept);
		System.out.println("직위 : " + position);
		System.out.println("급여 : " + salary);
		
	}
}
