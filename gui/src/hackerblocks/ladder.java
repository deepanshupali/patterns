	package hackerblocks;

import java.util.Scanner;

public class ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input  = new Scanner(System.in);
			int n = input.nextInt();
		    int nst = 1;
		    int row = 1;
		    int num=1;
		    while (row <= n) {
		        int cst = 1;
		       
		        while (cst <= nst) {
		            System.out.print(num+"\t");
		            num++;
		            cst++;
		        }
		        System.out.println();
		        row++;
		        nst++; 
	}
	}
}
