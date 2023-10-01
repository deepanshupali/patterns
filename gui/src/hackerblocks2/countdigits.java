package hackerblocks2;

import java.util.Scanner;

public class countdigits {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int num = input.nextInt();
	int dig = input.nextInt();
	int count = 0;
	while(num!=0) {
		int last = num%10;
		num = num/10;
		if(last == dig) {
			count++;
		}
	}
	System.out.println(count);
	
}
}
