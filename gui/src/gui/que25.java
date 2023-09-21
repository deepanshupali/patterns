package gui;

public class que25 {
que25(int input){
	 int n =input;
     int row = 1;
     int nst = 1;
     int nsp = n-1;
     int no = 1;
     while (row <= n) {
         int cst = 0;
         int csp = 0;
         while (csp < nsp) {
             System.out.print("\t");
             csp++;
         }
         while (cst < nst) {

	 

	 System.out.print(no+"\t");

             no++;
             cst++;
         }
         System.out.println();
         row++;
         nst = nst + 2;
         nsp--;

     }
}
}
