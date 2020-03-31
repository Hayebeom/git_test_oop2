package oop1;

import java.util.Scanner;

public class SampleTest {
	public static void main(String[] args) {
		
		int[] num = new int[10];
		String ox = "";
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		
		for (int i=0; i<num.length+1; i++) {
			
			System.out.println("O, X 중에서 입력하세요.");
			ox = sc.next();
			int count = 0;
			
			for(int j=0; j<num.length; i++) {
				if(ox.equals("O")) {
					count++;
					num[i] = num[i] + count;
				}
				else {
					count = 0;
				}
			}
		}
				
		for(int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }
	}
}
