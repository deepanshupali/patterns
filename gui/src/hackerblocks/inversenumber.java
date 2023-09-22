package hackerblocks;

import java.util.Scanner;

public class inversenumber {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int remain=n;
		int number=1;
		int reverse = 0;
		int count =0;
		while(number!=0) {
			int last= remain%10;
			System.out.println(remain);
			reverse = reverse*10+last;
			 remain=remain/10;
			 number =remain;
			count++;
		}
		System.out.println(count);
	}

}
