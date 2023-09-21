package gui;

public class que24 {
que24(int input){
	 int n = input;
     int row = 1;
     int nst = 1;
     int nsp = n-1;
     int no = 1;
     while (row <= n) {
         int cst = 0;
         int csp = 0;
         while (csp < nsp) {
             System.out.print("  ");
             csp++;
         }
         while (cst < nst) {

             System.out.print(" " + no);

             cst++;
         }
         System.out.println();
         row++;
         nst = nst + 2;
         nsp--;
         no++;
     }
}
}
