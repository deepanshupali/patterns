package gui;

public class que23 {
que23(int input){
	int n = input;
    int row = 1;
    int nst = 1;
    int nsp = n-1;
    while (row <= n) {
        int cst = 0;
        int csp = 0;
        while (csp < nsp) {
            System.out.print("  ");
            csp++;
        }
        while (cst < nst) {
            System.out.print(" 1");
            cst++;
        }
        System.out.println();
        row++;
        nst = nst + 2;
        nsp--;
    }
}
}
