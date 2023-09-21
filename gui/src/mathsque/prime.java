package mathsque;
import java.util.*;
public class prime {
	public static void main(String[] args) {
		System.out.println('h');
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count =0;
		
		int i = 2;
		while(i<n) {
			if(n%i==0) {
				System.out.println("not prime");
				break;
			}
			
			else if(count==0){
				System.out.println("prime");
				break;
			}
			i++;
			
			
			
		}
		
	}

}