package gui;

public class que2 {
	que2(int input){
		int n = input;
	    int nst = 1;
	    int row = 1;
	    while (row <= n) {
	        int cst = 1;
	        while (cst <= nst) {
	            System.out.print("* ");
	            cst++;
	        }
	        System.out.println();
	        row++;
	        nst++; 
	    }
	}
	
}
