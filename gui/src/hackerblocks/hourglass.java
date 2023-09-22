package hackerblocks;

import java.util.Scanner;

public class hourglass {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int nst = n ;
	int nst2=n;
	int nsp = 0;
	int zero = 1;
	int row=1;
	int num=n;
	int no=0;
	while(row<=n+(n+1)) {
		

		int cst = 0;
		int cst2=0;
		int csp=0;
		int czero=0;
		while(csp<nsp) {
			System.out.print("  ");
			csp++;
		}
		int noe=0;
		if(row<n+1) {
			 noe=num;
		}else {
			noe = no;
		}
		
		while(cst<nst) {
			
			System.out.print(noe+" ");
			noe--;
			cst++;
		}
		while(czero<zero) {
			System.out.print(0+" ");
			czero++;
		}
		int no2=1;
while(cst2<nst2) {
			
			System.out.print(no2+" ");
			no2++;
			cst2++;
		}


		System.out.println();
		row++;
		if(row>n+1) {
			nsp--;
			nst++;
			nst2++;
			 no++;
		}else {
			nsp++;
			nst--;
			nst2--;
			num--;
		}
		
		
		
	}
}
}
