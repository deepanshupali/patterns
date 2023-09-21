package gui;

public class que30 {
que30(int input){
	int n=input;
	int row = 1;
	int nst=n;
	while(row<=nst) {
		int cst=0;
		int num = 5;
		while(cst<nst) {
			System.out.print(num+" ");
			num--;
			cst++;
		}
		System.out.println();
		row++;
		
	}
}
}
