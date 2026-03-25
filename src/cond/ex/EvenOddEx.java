package cond.ex;

public class EvenOddEx {

	public static void main(String[] args) {
		int x = 2;
		String result = (x % 2 == 0) ? "짝수" : "홀수";
		System.out.println("x = " + x + result);
		
		
		System.out.println("===============");
		
		int grade = 1;
		int coupon = switch (grade) {
		case 1 -> 1000;
		case 2 -> 2000;
		case 3 -> 3000;
		case 4 -> 4000;
		default -> 0;
		};
		System.out.println("발급받은 쿠폰 " + coupon);
		
	}

}
