package gui;

public class que5 {
que5(int input){
	int row = 1;
    int n = input;
    int nsp = 0;
    int nst = input;
    while (row <= n) {
        int cst = 0;
        int csp = 0;

        while (csp < nsp) {
            System.out.print("  ");
            csp++;
        }
        while (cst < nst) {
            System.out.print("* ");
            cst++;
        }
        System.out.println();

        nsp++;
        nst--;
        row++;
    }
}
}
