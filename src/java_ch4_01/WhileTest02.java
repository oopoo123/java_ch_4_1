package java_ch4_01;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 10;
		
		while (a > 0) { // 무한루프
			System.out.println("안녕하세요!!!");
			a++; //a값이 반복될 때 마다 1씩 증가됨
			if (a == 20) { // a값이 1씩 증가되다가 a값이 20이 되면 break문으로 인해 while문 정지됨
				break;
			}
		}
//		while (a < 30) {
//			a++;
//			if (a % 2 == 0) {
//				continue;
//			}
//			System.out.println(a);
		
		while (b < 30) {
			b++;
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(b);
		}
		
	
	}

}
