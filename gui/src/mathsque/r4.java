package mathsque;

import java.util.Scanner;

public class r4 {
public static void main(String[] args) {
	
	Scanner input  = new Scanner(System.in);
	System.out.println("enter number");
	int n = input.nextInt();
	if(n>=1 && n<=100) {
		int nst=1;
		int row=1;
		while(row<=n) {
			int cst=0;
			while(cst<nst) {
				System.out.print("*");
				cst++;
			}
			row++;
			System.out.println();
			nst++;
		}
	}
	else {
		System.out.println("not valid");
	}
}
}
