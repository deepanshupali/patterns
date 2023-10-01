package hackerblocks2;

import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	if(n==1) {
		System.out.println(0);
	}
	if(n==2) {
		System.out.println(1);
	}
	int first=0;
	int second =1;
	int count = 2;
	while(count<=n) {
		
		int temp = first;
		first = second;
		second = temp+second;
		count++;
	}
	System.out.println(second);
	
}
}
