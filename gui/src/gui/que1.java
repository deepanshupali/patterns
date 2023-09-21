package gui;

public class que1 {
	que1(int input){
		  int row = 1;
	        int nst = input;
	        int n = input;

	        while (row <= n) {
	            int cst = 0;
	            while (cst < nst) {
	                System.out.print("* ");
	                cst++;
	            }
	            System.out.println();
	            row++;
	        }
	}
}
