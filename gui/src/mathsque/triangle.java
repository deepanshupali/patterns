package mathsque;
import java.util.*;
public class triangle {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	System.out.println("enter number");
	int n = input.nextInt();
	if(n>0 && n<10) {
		int row =1;
		int nst =1;
		
		int nsp =n-1;
		while(row<=n) {
			int cst=0;
			int csp =0;
			int num = row;
			
			while(csp<nsp) {
				System.out.print("\t");
				csp++;
			}
			while(cst<nst) {
				System.out.print("\t"+num);
				
				if (cst >=nst / 2) {
					num--;
				}
				else {
					num++;
				}cst++;
				
			}
			
			System.out.println();
			row++;
			nst+=2;
			nsp--;
			
		}
		
	}else {
		System.out.println("not valid");
	}
	
	
}
}
