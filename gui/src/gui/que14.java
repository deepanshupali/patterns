package gui;

public class que14 {
que14(int input){
	int size = input;
	int newSize = (size*2)-1;
	int nsp = size-1;
	int nst =1;
	int row=1;
	while(row<=newSize) {
		int cst = 0;
		int csp =0;
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
		if(row>size) {
			nsp++;
			nst--;
		}
		else {
			nsp--;
			nst++;
		}
		
		
	}
}
}
