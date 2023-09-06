package cen4025;

public class cen4025_fib {
	static int fibsequence(int n) {
		return n<=1?n:fibsequence(n-1) + fibsequence(n-2);
	}
	public static void main(String args[]) {
		int nth = 10;
		int result = fibsequence(nth);
		
		System.out.print(nth+"th term is "+result);
	}
}
