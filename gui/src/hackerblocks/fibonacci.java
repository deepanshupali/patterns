package hackerblocks;

import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int a =0;
	int b =1;
	int row = 1;
	int nst = 1;
	
	if(n==0) {
		System.out.println(n);
	}else {
	
		
		
		while(row<=n) {
			int cst= 0;
			int c=0;
			while(cst<nst) {
				if(row==1) {
					System.out.print(a+" ");
				}
				else if(row==2) {
					if(cst>0) {
						c = a+b;
						a=b;
						b =c;		
					}
					System.out.print(b+" ");
					
				}
				
				else {
					c = a+b;
					a=b;
					b =c;
					System.out.print(c+" ");
				}cst++;
			}
			System.out.println();
			row++;
			nst++;
		}
		
	}
	
}
}
