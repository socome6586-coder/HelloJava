package loop.ex;

public class WhileEx3 {

	public static void main(String[] args) {
		int max = 100;
		
		int sum = 0;
		int i = 1;
		while (i <= max) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
//		int max2 = 100000;
//		System.out.println((max2 * (max2+1)/2));
// 		개꿀팁
	}
}
