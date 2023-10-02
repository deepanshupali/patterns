package hackerblocks2;

import java.util.Scanner;

public class chewbacca {
public static void main(String[] args) {
	 Scanner i = new Scanner(System.in);
     long x = i.nextLong();
     long inv = 0;
     long mul = 1;
     while (x > 0) {
         long ld = x % 10;
         if (ld >= 5) {
             if ( x == 9) {
                 ld = 9;
             } else {
                 ld = 9 - ld;
             }
         }
         inv = inv + ld * mul;
         mul = mul * 10;
         x /= 10;
     }
     System.out.println(inv);
}
}
