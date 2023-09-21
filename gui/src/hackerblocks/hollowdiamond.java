package hackerblocks;

import java.util.Scanner;

public class hollowdiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

	int nst = n-n/2;
	int nst2 = n-n/2;  
	int nsp =-1;
	int row =1;
	int size=n;
	while(row<=size) {
		int cst =0;
		if(row==1 || row ==size) {
			cst=1;
		}
		while(cst<nst) {
			System.out.print("*\t");
			cst++;
		}
		int csp=0;
		while(csp<nsp) {
			System.out.print("\t");
			csp++;
		}
		int cst2 =0;
		while(cst2<nst2) {
			System.out.print("*\t");
			cst2++;
		}
		System.out.println();
		if(row >= n-n/2) {
			nst++;
			nst2++;
			nsp-=2;
		}else {
			nst--;
			nst2--;
			nsp+=2;
			
		}
		row++;
		
	}
	}

}
