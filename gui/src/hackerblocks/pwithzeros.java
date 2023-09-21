package hackerblocks;

import java.util.Scanner;

public class pwithzeros {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int row=1;
	int nst=1;
	while(row<=n) {
		int cst=0;
		int num = row;
		while(cst<nst) {
			if(cst==0 || cst==nst-1) {
				System.out.print(num+"\t");
			}
			else {
				System.out.print(0+"\t");
			}
			cst++;
		}
		row++;
		System.out.println();
		nst++;
	}
}
}
