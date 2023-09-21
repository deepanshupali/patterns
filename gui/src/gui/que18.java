package gui;

public class que18 {
que18(int input){
	int row=1;
	int n= input;
	int nst1=1;
	int nst2 = input;
	int nsp1 = input/2;
	int nsp2=0; 
	 
	while(row<=n) {
		int cst= 0;
		int cst2=0;
		int csp1=0;
		int csp2=0;
		
		if(row>(input/2+1)) {
			while(csp2<nsp2) {
				System.out.print("  ");
				csp2++;
			}
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
				
			}
		}
		else {
			while(csp1<nsp1) {
				System.out.print("  ");
				csp1++;
			}
			while(cst<nst1) {
				System.out.print("* ");
				cst++;
				
			}
		}
		row++;
		System.out.println();
		if(row>input/2+1) {
			nst2-=2;
			nsp2++;
		}
		nsp1--;
		nst1+=2;
		
		
		
		
	}
}
}
