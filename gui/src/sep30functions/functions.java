package sep30functions;

import java.util.Scanner;

public class functions {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr[]=new int[5];	
		System.out.println(arr);
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();

		}
		for(int i =0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}
		
	}
	public static void add () {
		
		int a =5;
		int b = 4;
		int c = a+b;
		System.out.println(c);
		return;
		
	}
}

