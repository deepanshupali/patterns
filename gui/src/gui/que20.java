package gui;

public class que20 {
que20(int input){
	int n = input;
	int row =1;
	int nsp=n/2;
	int nsp2=-1;
	int nst2=1;
	
	int nst =1;
	while(row<=n) {
		
		int cst=0;
		int cst2=0;
		int csp=0;
		int csp2=0;
if(row==1 || row ==n) {
			
			cst=1;
			
		}

		while(csp<nsp) {
			System.out.print("  ");
			csp++;
		}
		while(cst<nst) {
			System.out.print("* ");
			cst++;
		}
		
		
			while(csp2<nsp2) {
				System.out.print("  ");
				csp2++;

		}
		
		while(cst2<nst2) {
			System.out.print("* ");
			cst2++;
		}
		
		System.out.println();
		row++;
		if(row<=(n/2)+1) {
			nsp--;
			nsp2+=2;
		}
		else {
			nsp++;
			nsp2-=2;
		}

		
		
		
		
		
	}
}
}
