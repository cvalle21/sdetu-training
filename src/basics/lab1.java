package basics;

public class lab1 {

	public static void main(String[] args) {
		int n = 5;
		int[] values = {15,41,18,22,59,23};
	
		System.out.println("The sum of numbers (using recursive) from 1 to " + n + " is " + sumIt(n));
		System.out.println("The sum of numbers (using for loop) from 1 to " + n + " is " + sumItLoop(n));
		System.out.println("The factorial of " + n + " is " + fac(n));
		
		System.out.println("The minimum number of the array is " + arrMin(values));
		System.out.println("The average of the array is " + arrAvg(values));
		System.out.println("The maximum number of the array is " + arrMax(values));
	}
	
	public static int sumIt(int n){
		if (n == 0){
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return (n + sumIt(n - 1));
	}
	
	public static int sumItLoop (int nl) {
		int theSum = 0;
		for (int x = 0; x <= nl; x++) {
			theSum = theSum + x; 
		}
		return theSum;
	}
	
	public static int fac(int n){
		if (n == 0){
			return 1;
		}
		return (n * fac(n-1));
	}
	
	public static int arrMin(int[] a){
		int j = 0;
		for (int x = 0; x < a.length; x++){
			if (x == 0){
				j = a[0];
			} else {
				if (a[x] < j){
					j = a[x];
				}
			}
		}
		return j;
	}
	
	public static int arrAvg(int[] a){
		int totalSum = 0;
		for (int x = 0; x < a.length; x++){
			totalSum = totalSum + a[x];
		}
		return totalSum/a.length;
	}

	public static int arrMax(int[] a){
		int j = 0;
		for (int x = 0; x < a.length; x++){
			if (x == 0){
				j = a[0];
			} else {
				if (a[x] > j){
					j = a[x];
				}
			}
		}
		return j;
	}
}
