package hackerblocks;

import java.util.Scanner;

public class pascaltriangle {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();
	//input no of rows for print pascal triangle
	
	int i=0; 
	while(i<n){
	   
	  int count=1;
	   int k=0;
	   while(k<=i){
	   System.out.print(count+"\t");
	     count=count*(i-k)/(k+1);

	    k++;
	   }
	   System.out.println();

	i++;
	
	}
	}
}
