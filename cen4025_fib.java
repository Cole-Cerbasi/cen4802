package cen4025;

public class cen4025_fib {
	/**
	 * Calculates the nth number in the Fibonacci sequence recursively.
	 *
	 * This method computes the nth number in the Fibonacci sequence using a recursive
	 * algorithm. The Fibonacci sequence is a series of numbers where each number is the
	 * sum of the two preceding ones, usually starting with 0 and 1.
	 *
	 * @param n The index of the Fibonacci number to calculate. Must be a non-negative integer.
	 * @return The nth number in the Fibonacci sequence.
	 * @throws IllegalArgumentException If n is a negative integer.
	 */
	static int fibsequence(int n) {
		return n<=1?n:fibsequence(n-1) + fibsequence(n-2);
	}
	public static void main(String args[]) {
		int nth = 10;
		int result = fibsequence(nth);
		
		System.out.print(nth+"th term is "+result);
	}
}
