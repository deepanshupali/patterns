package hackerblocks2;

import java.util.Scanner;

public class oddeven {
public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	   int n = scn.nextInt();
		
		while(n > 0) {
			
			int num = scn.nextInt();
			oddeven(num);
			
			n--;
		}
		
	}
static void oddeven(int num) {
	
	int osum = 0;
	int esum=0;
	while(num!=0) {
		int last = num%10;
		num=num/10;
		if(last%2!=0) {
			osum = osum+last;
		}else {
			esum = esum+last;
		}
		
	}
	if(osum%3==0 || esum%4==0) {
		
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}

}
