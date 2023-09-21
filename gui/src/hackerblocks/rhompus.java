package hackerblocks;

import java.util.Scanner;

public class rhompus {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int row = 1;
	int nst  =1;
	int nsp=n-1;
	  
	int num2=n;
	while(row<=n+(n-1)) {
		int val;
		if(row<=n) {
			 val = row;
		}
		else {
			 val=num2;
		}
		
		
		int csp=0;
		int cst = 0;
		while(csp<nsp) {
			System.out.print("\t");
			csp++;
		}
		while(cst<nst) {
			
			System.out.print(val+"\t");
			if(cst >=nst/2) {
				val--;
			}else {
				val++;
			}
			cst++;
			 
			
		}
		row++;
		
		System.out.println();
		if(row<=n) {
			nst+=2;
			nsp--;
		}else {
			nst-=2;
			nsp++;
			num2--;
		}
		
		
}
}
}