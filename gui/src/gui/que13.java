package gui;

public class que13 {
que13(int input){
	int n = input;
	int row = 1;
	int newN = (n*2)-1;
	int nst = 1;
	while(row<=newN) {
		int cst = 0;
		while(cst<nst) {
			System.out.print("* ");
			cst++;
		}
		System.out.println();
		row++;
		if(row<=n) {
			nst++;
		}else {
			nst--;
		}
		
		
	}
	
	
}
}
