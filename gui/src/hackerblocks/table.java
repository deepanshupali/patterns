package hackerblocks;

import java.util.Scanner;

public class table {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	int n = input.nextInt();
	Scanner input2  = new Scanner(System.in);
	int times = input.nextInt();
	for(int i =1;i<=times ;i++) {
		System.out.println(n*i);
	}
}
}
