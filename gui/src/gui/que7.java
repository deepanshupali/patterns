package gui;

public class que7 {
que7(int input){
	int n = input;
	int row =0;
	int nst = n;
	int nsp = n-2;
	while(row<=n) {
		if(row==0 || row == n) {
			int cst =0;
			while(cst<nst) {
				System.out.print("* ");
				cst++;
			}
			 
		}
		else {
			int csp = 0;
			
			System.out.print("* ");
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			System.out.print("* ");
		}
		System.out.println();
		row++;
	}
}
}
