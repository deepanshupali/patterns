package gui;

public class que9 {
que9(int input){
	int n = input;
	int row= 1;
	int nst = 1;
	int nsp = n-1;
	while(row<=n) {
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
		nst+=2;
		nsp--;
	}
}
}
