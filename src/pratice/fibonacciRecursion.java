package pratice;

public class fibonacciRecursion {

	public static void main(String[] args) {
		
		fibonacciRecursion f = new fibonacciRecursion();
		System.out.println(f.fib(0));
		
		
	}
	public int fib(int a) {
		if(a<=1) { 
			return 1;
		}
		
		return fib(a-1)+fib(a-2);
		
	}
}
