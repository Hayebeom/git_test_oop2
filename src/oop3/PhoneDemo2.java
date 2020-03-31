package oop3;
/**
 * 10
 * @author HYB
 *
 */
import java.util.Scanner;

public class PhoneDemo2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SmartPhone testPhone = null;
		
		System.out.println("인터넷 기능을 테스트할 폰을 선택하세요.");
		System.out.println("1.스마트폰		2.아이폰		3.갤럭시");
		int no = sc.nextInt();
		
		if (no == 1) {
			System.out.println("스마트폰 객체로 테스트를 진행합니다.");
			testPhone  = new SmartPhone();
		} else if (no == 2) {
			System.out.println("아이폰 객체로 테스트를 진행합니다.");
			testPhone  = new Iphone();
		} else if (no == 3) {
			System.out.println("갤럭시 객체로 테스트를 진행합니다.");
			testPhone  = new Galaxy();
		}
		
		if(testPhone != null) {
			testPhone.internet();
		} else {
			System.out.println("잘못된 번호를 입력하였습니다.");
		}
	
		sc.close();
	}
}
