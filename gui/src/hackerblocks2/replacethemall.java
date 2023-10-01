package hackerblocks2;

import java.util.Scanner;

public class replacethemall {
	    public static void main(String args[]) {
	        Scanner input = new Scanner(System.in);

	        long n = input.nextLong();
	        long num = n; // Store the original input
	        long pv = 1;
	        long sum = 0;

	        if (n == 0) {
	            System.out.println(5);
	        } else {
	            while (num > 0) {
	                long last = num % 10;
	                System.out.println(last);
	                if (last == 0) {
	                    last = 5;
	                }
	                sum = sum + last * pv;
	                pv = pv * 10;
	                num = num / 10; // Update 'num', not 'n'
	            }
	            System.out.println(sum);
	        }
	    
	

	}
}
