package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

	public static void main(String[] args) {
	
		// 숫자 2개 입력받아서 합을 출력 , 합이 100 이상이면 출력안하고 종료
		Scanner sc = new Scanner(System.in);

		while(true) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		
		if(sum >= 100) {
			System.out.println("종료");
			break;
		} 
		System.out.println(sum);
	} //-------------------------------------
	
		
		
		
		
		
	}//main
}