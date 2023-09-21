package mathsque;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int n = input.nextInt();
		int row =1;
		int nst1=(n/2)+1;
		int nsp1=-1;
		int nst2=(n/2)+1 ;
			
		while(row<=n) {
			int cst1 = 0;
			int cst2 = 0;
			if(row==1 || row==n) {
				cst1=1;
				
			}
			while(cst1<nst1) {
				System.out.print("*\t");
				cst1++;
			}
			int csp1=0;
			while(csp1<nsp1) {
				System.out.print("\t");
				csp1++;
			}

			while(cst2<nst2) {
				System.out.print("*\t");
				cst2++;
			}
			
			System.out.println();
			if(row>=(n/2)+1) {

				nst1++;
				nsp1-=2;
				nst2+=1;
				
			}
			else {
				
				nst1--;
				nsp1+=2;
				nst2--;
				
			}
			row++;
		}
		
	}
}
//reverse