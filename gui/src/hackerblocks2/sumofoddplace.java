package hackerblocks2;

import java.util.Scanner;

public class sumofoddplace {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int count =1;
	int odd=0;
	int even=0;
	while(n!=0) {
		int last = n%10;
		n=n/10;
		if(count%2!=0) {
			odd = last+odd;
		}
		else {
			even = last+even;
		}
		count++;
	}
	System.out.println(odd);
	System.out.println(even);
}
}
