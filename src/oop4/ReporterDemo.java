package oop4;
/**
 * 3
 * @author HYB
 *
 */
public class ReporterDemo {
	public static void main(String[] args) {

		String[] names = {"김유신", "강감찬", "이순신", "류관순", "윤봉길"};
		DataOutput do1 = new DataOutput();
		ConsoleDataOutput do2 = new ConsoleDataOutput();
		FileDataOutput do3 = new FileDataOutput("c:/files", "data.txt");
		/* ★ 객체의 형변환 
		FileDataOutput을 setOutputter에 담으려고 했는데
		DataOutput 매개변수가 아니라 FileDataOutput 매개변수다
		그럼 부모 클래스인 DataOutput으로 올라가면서 매개변수를 확인한다
		DataOutput 클래스에 DataOutput 매개변수를 받는가? 네
		그럼 DataOutput 매개변수를 사용한다
		*/
		
		Reporter reporter = new Reporter();
		
		// Reporter 객체의 setOutputter()메서드를 이용해서 Reporter 객체의
		// DataOutput 멤버변수에 데이터 출력을 지원하는 객체(DataOutput류 객체)를 전달, 조립시킴
		reporter.setOutputter(do3); // 교체 품목 do1 do2 do3...
		reporter.setData(names);

		reporter.reporting();
	}
}
