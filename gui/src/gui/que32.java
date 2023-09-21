package gui;

public class que32 {
que32(int input){
	int n=input;
	int size=n+4;
	int row = 1;
	int nst =1;
	int num=1;
	
	while(row<=size) {
		int cst=0;
		while(cst<nst) {
			if(cst%2==0) {
				System.out.print(num+" ");
				
			}
			else {
				System.out.print('*'+" ");
				
			}
			cst++;
		}
		System.out.println();
		row++;
		if(row>n) {
			nst-=2;
			num--;
		}else {
			nst+=2;
			num++;
		}
		
	}
}
}
