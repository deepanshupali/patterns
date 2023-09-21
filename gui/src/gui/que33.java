package gui;

public class que33 {
	que33(int input) {
		int n = input;
	 	int row= 1;
		int nst =1;
		int nsp = n-1;
		
		int num =n-1;
		while(row<=n) {
			int cst=0;
			int csp=0;
			int i=num;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			while(cst<nst) {
				if(row==1 || cst==nst/2) {
					System.out.print(0+" ");
				}
				
				
				else if(cst<nst/2){
					
					System.out.print(i+" ");
					i++;
				}
			
				else {
					i--;
					System.out.print(i+" ");
					
				}
				cst++;
			
				
			}
			System.out.println();
			row++;
			nst+=2;
			nsp--;
			if(row>2) {
				
				num--;
			}
			
		}
	}
}
