package hackerblocks;

import java.util.Scanner;

public class ftoc {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int Min = input.nextInt();
	Scanner mins  = new Scanner(System.in);
	int max = input.nextInt();
	Scanner maxs  = new Scanner(System.in);
	int step = input.nextInt();
	
	for(int i =0;i<=max;i+=step) {
		
		int c = ((i-32)*5)/9;
		System.out.print(i+" ");
		System.out.print(c+" ");
		System.out.println(); 
	}
}
}
