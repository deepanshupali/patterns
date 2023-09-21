package hackerblocks;

import java.util.Scanner;

public class triangle {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int row = 1;
	int nst  =1;
	int nsp=n-1;
	  
	
	while(row<=n) {
		int val = row;
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
		nst+=2;
		nsp--;
		
		
}}
}
