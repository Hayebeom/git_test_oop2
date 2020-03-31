package oop2;

public class ColorPrinter extends Printer {
	
	// Printer로부터 상속받은 print() 메서드의 기능을 재정의
	
	@Override
	// @는 Annotation 이라는 것을 표시
	// Annotation : 부가적인 정보를 나타낼 때 사용
	// Annotation 의 정보는 편집기, 컴파일러, 프레임워크, 응용프로그램에서 그 정보를 활용할 수 있음
	void print() {
		System.out.println("컬러로 내용을 출력합니다.");
	}
	
	
	
}
