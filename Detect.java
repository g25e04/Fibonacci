package summer025;

import java.util.Scanner;

public class Detect {

	private String choose;
	private String end="Fend";
	private String aa = "!";
	int number=0;
Scanner sc = new Scanner(System.in);
	public Detect() {
		// TODO Auto-generated constructor stub
		while(true) {
			choose = sc.next();
			menu();
		}
	}

	
	public void menu() {
		if(choose.equals(end)) {
			System.out.println("¨t²Îµ²§ô");
			System.exit(0);
		}
		else if(choose.contains(aa)) {
			int a = choose.length()-1;
			String temp = choose.substring(0,a);
			int real = Integer.parseInt(temp);
			System.out.println(factorial(real));
		}
		else {
			int real = Integer.parseInt(choose);
			System.out.println(fib(real));
		}
	}
	
	public static long factorial(int n) {
		if(n==0)
			return 1;
		else
			return n * factorial(n-1);
	}
	
	public static long fib(long n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
}
