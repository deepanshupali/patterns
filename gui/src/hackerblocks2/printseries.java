package hackerblocks2;

import java.util.Scanner;

public class printseries {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int nth = input.nextInt();
	int dig = input.nextInt();
	int count = 0;
	int i =1;
	while(count<nth) {
		int val = 3*i +2;
		
		if(val%dig!=0) {
			System.out.println(val);
			count++;
		}
		i++;
		
	}
}
}
