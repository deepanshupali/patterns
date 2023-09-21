package gui;

public class que29 {
que29(int input) {
	int n = input;
 	int row= 1;
	int nst =1;
	int nsp = n-1;
	
	int num =1;
	while(row<=n) {
		int cst=0;
		int csp=0;
		while(csp<nsp) {
			System.out.print("  ");
			csp++;
		}
		while(cst<nst) {
			if(cst<1 || cst==nst-1) {
				System.out.print(num+" ");
			}
			else {
				System.out.print(0+" ");
			}
			cst++;
		
			
		}
		System.out.println();
		row++;
		nst+=2;

		nsp--;
		num++;
	}
}
}
