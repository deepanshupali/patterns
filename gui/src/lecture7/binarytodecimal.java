package lecture7;


import java.util.Scanner;


public class binarytodecimal {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int ans=0;
	int mul =1;
	int sum=0;
	while(n>0) {
		int rem =n%10;
		 sum =ans+rem*mul;
		n=n/10;
		mul=mul*2;
	}
	System.out.println(sum);
}
}
