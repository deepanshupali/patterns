package hackerblocks2;

import java.util.Scanner;

public class armstrong {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	int on = n;
	int on2=n;
	int p=0;
	while(n!=0) {
		n =n/10;
		p++;
	}
	
	int sum=0;
	
	while(on!=0) {
		int mul=1;
		int rem = on%10;
		on =on/10;
		
		for(int i =0;i<p;i++) {
			 mul = mul*rem;
			 
		}

		sum=sum+mul;
		
	}
	if(sum==on2) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	
}
}
