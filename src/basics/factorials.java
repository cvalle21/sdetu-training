package basics;

public class factorials {

	public static void main(String[] args) {
		//1! = 1 * 1 = 1
		//2! = 2 * 1 = 2
		//3! = 3 * 2 * 1 = 6
		//4! = 4 * 3 * 2 * 1 = 24
		//5! = 5 * 4 * 3 * 2 * 1 = 120
		int n = 5;
		System.out.println(fac(n));
	}
	
	public static int fac(int n){
		if (n == 0){
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		return (n * fac(n-1));
	}

}
