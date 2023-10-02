package sep30functions;

import java.util.Scanner;

public class arrayque {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int arr[]=new int[5];	
//	taking input
	for(int i =0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
//	calling max with array as argument
	int ar[]= {1,23,23,23,2};
 swap(ar,arr,0,4);
 
 for(int i =0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
 System.out.println(ar[0]);
 System.out.println(arr[0]);
}

public static void swap(int ar[],int arr[],int f,int s) {
		for(int i=0;i<arr.length;i++) {
			int temp[] = arr;
			arr = ar;
			ar=temp;
			arr[f]=arr[s];
			System.out.println(temp);
		}
		
}
}
