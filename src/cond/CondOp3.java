package cond;

public class CondOp3 {

	public static void main(String[] args) {
		int a = 1200;
		int b = 1500;
		int max = (a > b) ? a : b;
		System.out.println("더 큰 숫자는 "+ max + "입니다.");
		System.out.println("==============");
		
		double c = 20.5;
		double d = 20.6;
		double e = (c > d) ? c : d;
		System.out.println("더 큰 숫자는 " + e + "입니다.");
		System.out.println("==============");
		
		long f = 3132352311l;
		long g = 4034235231l;
		long h = (f > g) ? f : g;
		System.out.println("가장 큰 숫자는 " + h + "입니다.");
		System.out.println("==============");
		
		int aa = 17;
		int bb = 5;
		int ab = (aa < bb) ? aa : bb;
		System.out.println("가장 작은 숫자는 " + ab + "입니다.");
		System.out.println("==============");
		
		
	}

}
