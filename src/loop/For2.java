package loop;

public class For2 {

	public static void main(String[] args) {
		int sum = 0;
		int endNum = 20;
		
		for (int i = 3; i <= endNum; i++) {
			sum = sum + i;
			System.out.println("i=" + i + " sum=" + sum);
		}
		
	}

}
