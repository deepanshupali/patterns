package mathsque;

import java.util.Scanner;

public class hcf {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	
	int dividend =input.nextInt();
	int divisor =input.nextInt();
	while(dividend % divisor >0) {
		int rem = dividend % divisor;
		dividend = divisor;
		divisor=rem;
	}
	System.out.println(divisor);
} 
}
//lcm*ncf = a*bfe