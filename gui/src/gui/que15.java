package gui;

public class que15 {
que15(int input){
	int size=input;
	int newSize = (size*2)-1;
	
	
	int row =1;
	int nsp=0;
	int nst =5;
	while(row<=newSize) {
		int csp = 0;
		int cst = 0;
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
			nsp = nsp -2;
			nst= nst+1;
		}
		else {
			nsp = nsp +2;
			nst= nst-1;
		}
	}
	
}

}
