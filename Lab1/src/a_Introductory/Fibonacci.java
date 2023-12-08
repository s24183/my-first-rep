package a_Introductory;

public class Fibonacci {
	public int fib(int n) {
		switch (n) {
			case 0: return 0;
			case 1: return 1;
			//It should not have +1 after the fib function because it will always increase by one rather than the actual values.
			default: return (fib(n - 1) + fib(n - 2)) ;
		}
	}
}
