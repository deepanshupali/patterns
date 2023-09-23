package hackerblocks;

import java.util.Scanner;


public class mirrorstar {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
	
			int n=scan.nextInt();
			int row=1;
			int nst =1;
			int nsp=n/2;
			System.out.println(nsp);
			while(row<=n) {
				int cst=0;
				int csp=0;
				while(csp<nsp) {
					System.out.print("  ");
					csp++;
				}
				while(cst<nst) {
					System.out.print("* ");
					cst++;
				}
				System.out.println();
				if(row<=n/2) {
					nst+=2;
					
					nsp--;
				}
				else {
					nst-=2;
					
					nsp++;
				}
				row++;
			}
		}
}
