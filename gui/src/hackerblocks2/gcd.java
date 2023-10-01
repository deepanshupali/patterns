package hackerblocks2;

import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		while(n1%n2!=0) {
			int remainder = n1%n2;
			n1=n2;
			 n2 = remainder;
			 
		}
		System.out.println(n2);
	}
}
