package java_ch4_01;

import java.util.Scanner;

//1월부터 12월까지 임의의 월을 입력받아 해당 월의 일수 (30일, 31일, 28일)를 출력하는 프로그램(SWTCH~CASE문)
public class SwitchExer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("해당 월의 일수를 알고 싶은 월을 숫자로 입력하세요(1~12):");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt(); // 정수를 키보드로 부터 입력 받음
		//System.out.println(month);
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;

		default:
			System.out.println("1부터 12까지의 수 중 1개를 넣어주세요!");
			break;
		}

	}

}
