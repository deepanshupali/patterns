package hackerblocks2;

import java.util.Scanner;

public class binarytodecimal {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int p=1;
	int res=0;
	while(n!=0) {
		int rem = n%10;
		n=n/10;
		 res =res+ rem*p;
		p = p*2;
	}
	System.out.println(res);
}
}
