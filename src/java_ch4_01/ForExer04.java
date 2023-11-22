package java_ch4_01;

public class ForExer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//중첩 for문으로 구구단 만들기
		
		for (int i = 1;i <= 9;i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + "X" + j + " = " + (i * j));
			}
			System.out.println("------------------");
		}

	}

}
