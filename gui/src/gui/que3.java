package gui;

public class que3 {
	que3(int input){
		int n = input;
        int row = 1;
        int nst = input;
        while (row <= n) {
            int cst = 0;
            while (cst < nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            row++;
            nst--;
        }
	}
}
