package hackerblocks;

import java.util.Scanner;

public class hollowrhombus {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);


    int n = scanner.nextInt();
    int row =1;
    int nsp=n-1;
    int nst=n;
    int nsp2=n-2;
    while(row<=n) {
    	int cst=0;
    	int csp=0;
    	int csp2=0;
    	if(row==1) {
    		while(csp<nsp) {
        		System.out.print(" ");
        		csp++;
        	}
        	while(cst<nst) {
        		System.out.print("*");
        		cst++;
        	}
    	}
    	else if(row==n) {
    		while(cst<nst) {
        		System.out.print("*");
        		cst++;
        	}
    	}
    	else {
    		while(csp<nsp) {
        		System.out.print(" ");
        		csp++;
        	}
    		System.out.print("*");
    		while(csp2<nsp2) {
    			System.out.print(" ");
    			csp2++;
    		}
    		System.out.print("*");
    	}
    	
    	
    	System.out.println();
    	row++;
    	nsp--;
    }
}
}
