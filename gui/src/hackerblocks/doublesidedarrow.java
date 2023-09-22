package hackerblocks;

import java.util.Scanner;

public class doublesidedarrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int row =1;
		int nsp=n-1;
		int nst = 1; 
		int nsp2=-1;
		int nst2=1;
		int val=1;
		while(row<=n) {
			int cst = 1;
			int csp =0;
			
			
			int val2=1;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			if(row>n-n/2) {
				val-=2;
			}
			
			while(cst<=nst) {
				
				System.out.print(val+" ");
				val--;
				cst++;
				
			}val =cst;
			
			
			int csp2=0;
//			for triangle in between
			while(csp2<nsp2) {
				System.out.print("  ");
				csp2++;
			}
//			for right pattern
			int cst2=0;
			if(row==1 || row==n) {
				 cst2=1;
			}
			
			while(cst2<nst2) {
				System.out.print(val2 +" ");
				cst2++;
				val2++;;
			}
			if(row<n-n/2) {
				nst++;
				nsp-=2;
				nsp2+=2;
				nst2++;
			}else {
				nst--;
				nsp+=2;
				nsp2-=2;
				nst2--;
			}
			System.out.println();
			row++;
			
		}
	}

}
