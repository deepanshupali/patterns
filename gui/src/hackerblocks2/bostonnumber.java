package hackerblocks2;

import java.util.Scanner;

public class bostonnumber {
public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	  
	 
	   int n = scn.nextInt();
	   int copyn =n;
	   if(n>1) {
		   
		   int i=2;
		   int sum=0;
		   int dsum=0;
		   while(n>1) {
			   
			   
			   if(n%i==0) {
				   
				   sum=sum+sumofdig(i);
				   
				   n=n/i;

			   }else {
				   i++;
			   }
			  
		   }
		   
		   while(copyn!=0) {
			   int last = copyn%10;
			   dsum = sumofdig(last)+dsum;
			   copyn=copyn/10;
		   }
		
		   if(sum==dsum) {
			   System.out.println(1);
		   }
		   else {
			   System.out.println(0);
		   }
		  
		   
	   }
	   
	   
}
static int sumofdig(int n) {
	int sum =0;
	while(n!=0) {
		
		   int rem = n%10;
		   sum = sum +rem;
		   n=n/10;
	}
return sum;
	   
}
}
