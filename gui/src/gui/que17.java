package gui;

public class que17 {
	que17(int input){
		int n=input;
		int row=1;
		int nst=n/2;
		int nsp=1;
		int nsp2=0;
		int nst2=n/2;
		while(row<=n) {
			int cst=0;
			int cst2=0;
			int csp=0;
			int csp2=0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
			}
			
			System.out.println();
			if(row<(n/2)+1) {
				nst--;
				nsp+=2;
				nst2--;
			}
			else {
				nst++;
				nsp-=2;
				nst2++;
			}
			row++;
			
		}
	}
}