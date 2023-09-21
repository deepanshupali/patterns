package gui;

public class que4 {
que4(int input){
	 int n = input;
     int row = 1;
     int nsp = n - 1;
     int nst = 1;
     while (row <= n) {
         int csp = 0;
         int cst = 0;
         while (csp < nsp) {
             System.out.print("  ");
             csp++;
         }
         while (cst < nst) {
             System.out.print("* ");

             cst++;
         }

         System.out.println();
         row++;
         nsp--;
         nst++;
     }
}
}
