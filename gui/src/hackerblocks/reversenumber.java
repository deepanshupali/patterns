package hackerblocks;

import java.util.Scanner;

public class reversenumber {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int sum=0;
	while(n!=0) {
		int ld = n%10; 
		 n = n/10;
		  	sum = sum *10+ld;
		
	}
	System.out.println(sum);
}
}
