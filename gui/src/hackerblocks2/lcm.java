package hackerblocks2;

import java.util.Scanner;

public class lcm {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n1 = input.nextInt();
	int n2 = input.nextInt();
	int on1=n1;
	int on2=n2;
	while(n1%n2!=0) {
		int remainder = n1%n2;
		n1=n2;
		 n2 = remainder;
		 
	}
	int lcm = (on1*on2)/n2;
	System.out.println(lcm);
}
}
