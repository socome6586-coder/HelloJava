package cond;

public class CondOp2 {

	public static void main(String[] args) {
		int age = 18;
		String status = (age >= 18) ? "성인" : "미성년자";
		System.out.println("age = " + age + " status = " + status);
		
		int age2 = 15;
		String status2 = (age2 >= 16) ? "가능" : "불가능";
		System.out.println("age2 = " + age2 + " status2 = " + status2);
	}

}
