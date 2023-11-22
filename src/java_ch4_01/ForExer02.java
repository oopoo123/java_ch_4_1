package java_ch4_01;

public class ForExer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제) 대문자를 "A"부터 "Z"까지  출력하는 프로그램
		// (for문으로 char타입변수 1개만 사용)
		// 출력 예) ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		char chr = 'A'; // 대문자 A의 아스키코드값 65
		int i;
		
//		for (i = 65;i <= 90; i++) {
//			System.out.printf("%c", i);
//			
//		}
		for (i = chr;i <= 'Z'; i++) {
			System.out.printf("%c", i);
		}

	}

}
