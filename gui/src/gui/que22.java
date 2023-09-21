package gui;

public class que22 {
que22(int input){
	int n= input;
	int row=1;
	int nst=5;
	int nst2=5;
	int nsp=1;
	while(row<=n) {
		int cst=0;
		int cst2=0;
		int csp = 1;
//		if(row==n) {
//			cst=1;
//		}
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
		nst--;
		nst2--;
		nsp+=2;
		row++;
	}
}
}
