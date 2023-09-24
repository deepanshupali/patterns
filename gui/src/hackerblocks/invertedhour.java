package hackerblocks;

import java.util.Scanner;

public class invertedhour {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int nst =1;
	int nst2=1;
	int nsp=2*n-1;
	int row=1;
	int no =5;
	while(row<=2*n+1) {
		int cst=0;
		int num=n;
		if(row==n+1) {
			cst=1;
		}
		while(cst<nst) {
		System.out.print(num+" ");
		num--;
		cst++;
		}
		int csp=0;
		while(csp<nsp) {

				System.out.print("  ");

			
			csp++;
		}
		int cst2=0;
		
		int no1=no;
		while(cst2<nst2) {
			num++;
			System.out.print(num+" ");
//			no1++;
			cst2++;
		}
		
		row++;
		System.out.println();
		if(row<=n+1) {
			nst++;
			nst2++;
			nsp-=2;
			no--;
		}else {
			nst--;
			nst2--;
			nsp+=2;
			no++;
		}
	
		
	}
	
	
	
}
}
