package hackerblocks;

import java.util.Scanner;

public class r4 {
	
	    public static void main(String args[]) {
	   
		Scanner input  = new Scanner(System.in);

		int n = input.nextInt();
		
			int nst=1;
			int row=1;
			while(row<=n) {
				int cst=0;
				while(cst<nst) {
					System.out.print("*");
					cst++;
				}
				row++;
				System.out.println();
				System.out.println();
				nst++;
			}
		
		
	    }
}
