package oop11;

public class HTAListDemo {
	
	public static void main(String[] args) {
		
		HTAList list = new HTAList();
		
		// 값 저장
		list.add("홍길동");
		list.add("김유신");
		list.add("강감찬");
		list.add("이순신");
		list.add("류관순");
		
		// 값 꺼내기
		HTAIterator hta = list.iterator();
		
		// while문으로 간단하게 가능
		// Iterator의 hasNext()가 true를 반환하는 동안 while 블록 내의 수행문이 실행됨
		while(hta.hasNext()) {
			String value = hta.next();
			System.out.println("이름 : " + value);
		}
		
		/* 
		String value1 = hta.next();
		boolean hasValue1 = hta.hasNext();
		System.out.println(hasValue1 + ", " + value1);

		String value2 = hta.next();
		boolean hasValue2 = hta.hasNext();
		System.out.println(hasValue2 + ", " + value2);

		String value3 = hta.next();
		boolean hasValue3 = hta.hasNext();
		System.out.println(hasValue3 + ", " + value3);

		String value4 = hta.next();
		boolean hasValue4 = hta.hasNext();
		System.out.println(hasValue4 + ", " + value4);

		String value5 = hta.next();
		boolean hasValue5 = hta.hasNext();
		System.out.println(hasValue5 + ", " + value5);

		boolean hasValue6 = hta.hasNext();
		System.out.println(hasValue6);
		*/
		
	}
}
