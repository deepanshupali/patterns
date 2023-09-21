package gui;

public class que31 {
	que31(int input){
		int n=input;
		int row = 1;
		int nst=n;
		int i = n;
		while(row<=nst) {
			int cst=0;
			int num = 5;
			while(cst<nst) {
				if(cst==i-1) {
					System.out.print("* ");
					i--;
				}
				else {
					System.out.print(num+" ");
				}
				
				num--;
				cst++;
			}
	System.out.println();
			row++;
		}
	}
}
