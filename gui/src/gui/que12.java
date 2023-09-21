package gui;

public class que12 {
que12(int input){
	int n = input;
	int row= 1;
	int nst=1;
	int nsp = n-1;
	
	while(row<=n) {
		int cst=0;
		int csp=0;
		while(csp<nsp) {
			System.out.print("  ");
			csp++;
		}
		while(cst<nst) {
			
//			System.out.print("*   ");
			if(cst%2==0) {
				System.out.print("* ");
				cst++;
			}
			else {
				System.out.print("! ");
				cst++;
			}
			
			
		}
		System.out.println();
		nst=nst+2;
		nsp--;
		row++;
	}
}
}
