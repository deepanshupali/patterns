package hackerblocks2;

import java.util.Scanner;

public class shoppinggame {
public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	  
	 
	   int inp = scn.nextInt();
		
		while(inp > 0) {
			
			 int m = scn.nextInt();
			   int n = scn.nextInt();
			   int asum=0;
			   int hsum=0;
			   int i =1;
			   int j =2;
			  
			 while(asum<m  ) {
				  
				   asum = asum+i;

				  
				   i+=2;
				   
			   }while(hsum<n) {
				   hsum =hsum+j;
				   j+=2;
			   }
			   if(asum>hsum) {
				   System.out.println("Aayush");
				   
			   }
			   else {
				   System.out.println("Harshit");
			   }
			inp--;
		}
		
	  
}
}
