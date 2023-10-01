package hackerblocks2;

import java.util.Scanner;

public class simpleinput {
public static void main(String[] args) {
	int sum = 0;
	int num;
	 Scanner scn = new Scanner(System.in);
	while(sum>=0) {
		
		  
		 
		    num = scn.nextInt();
		   sum = sum+num;
		   if(sum<0) {
			   break;
		   }
		   System.out.println(num);
	}
	scn.close();
		
	
}
}
