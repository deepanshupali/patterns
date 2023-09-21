package hackerblocks;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int a=2;
		boolean check=true;
		while( a<9) {

			if(n!=a && n%a == 0) {

				check=true;
				break;
			}
			else {
				check=false;
			}
			a++;
		}
		if(check==true) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
