package gui;

public class que6 {
	que6(int input){
		int n = input;
		int row = 1;
		int nst = input;
		int nsp = 0;
		while(row<=n){
			int cst = 0;
			int csp = 0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			nst--;
			nsp+=2;
		}
	}
}
