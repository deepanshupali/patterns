package gui;

public class que8 {
que8(int input){
	int n = input;
	int row =1;
	while(row<=n) {
		int col =1;
	
		while(col<=n) {
			if(row==col || col+row==6) {
				System.out.print(" *");
			}else {
				System.out.print("  ");
			}
			col++;
			
			
		}
		System.out.println();
		row++;
	}
}
}
