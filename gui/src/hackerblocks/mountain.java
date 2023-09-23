package hackerblocks;

import java.util.Scanner;

public class mountain {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int row=1;
	int nst=1; 
	int nst2=1;
	int nsp=2*n-3;
	
	while(row<=n) {
		int num =1;
		int num2=row;
		int cst=0; 
		int cst2=0;
		int csp = 0;
		if(row==n) {
			cst2=1;
		}
		while(cst<nst) {
			System.out.print(num+"\t");
			num++;
			cst++;
		}
		while(csp<nsp) {
			System.out.print("\t");
			csp++;
		}
		while(cst2<nst2) {
			if(cst2>0) {
				num2--;
				System.out.print(num2 +"\t");
				
			}
			else {
				System.out.print(num2+"\t");
			}
			
			
			cst2++;
			
		}
		System.out.println();
		nst++;
		nst2++;
		nsp-=2;
		row++;
		num2++;
	}
}
}
