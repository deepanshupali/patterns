package gui;

public class que28 {
que28(int input){
//	int n =input;
//	int row = 1;
//	int nsp = n-1;
//	int non = 1;
//	
//	while (row<=n) {
//		int col =0;
//		int csp = 0;
//		int con =0;
//		int number=1;
//		while(csp<nsp) {
//			System.out.print("  ");
//			csp++;
//			col++;
//		}
//		while(con<non) {
//			System.out.print(number+" ");
//			
//			col++;
//			if(col>=5) {
//				number--;
//			}else {
//				number++;
//			}
//			con++;
//		}
//		System.out.println();
//		non+=2;
//		nsp--;
//		row++;
//	}
//	
	int n=input;
	int row = 1;
	int nst  =1;
	int nsp=n-1;
	
	 
	while(row<=n) {
		int val = row;
		int csp=0;
		int cst = 0;
		while(csp<nsp) {
			System.out.print("  ");
			csp++;
		}
		while(cst<nst) {
			
			System.out.print(val+" ");
			if(cst >=nst/2) {
				val--;
			}else {
				val++;
			}
			cst++;
			 
			
		}
		row++;
		System.out.println();
		nst+=2;
		nsp--;
		
		
	}
}
}
