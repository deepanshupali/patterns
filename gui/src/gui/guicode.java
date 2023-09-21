//package gui;
//
//public class guicode {
//public static void main(String[] args) {
//	
//	new que1(input);
//	System.out.println();
//	new que2(input);
//	System.out.println();
//	new que3(input);
//	System.out.println();
//	new que4(input);
//	System.out.println();
//	new queinput(input);
//	System.out.println();
//	new que6(input);
//	System.out.println();
//	new que7(input);
//	System.out.println();
//	new que8(input);
//	System.out.println();
//	new que9(input);
//	System.out.println();
//	new que10(input);
//	System.out.println();
//	new que11(input);
//	System.out.println();
//	new que12(input);
//	System.out.println();
//	new que13(input);
//	System.out.println();
//	new que14(input);
//	System.out.println();
//	new que1input(input);
//	System.out.println();
//	new que16(input);
//	System.out.println();
//	new que18(7);
//	//17,19,20
//	System.out.println();
//	new que21(input);
//	System.out.println();
//	new que22(input);
//	System.out.println();
//	new que23(input);
//	System.out.println();
//	new que24(input);
//	System.out.println();
//	new que2input(input);
//	System.out.println();
//	new que26(input);
//	System.out.println();
//	new que27(input);//using columns
//	
//}
//}
// 
// 29,30,31,32,33
package gui;
import java.util.Scanner;

public class guicode{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a question number: ");
        int questionNumber = scanner.nextInt();
        
        System.out.print("Enter the input value: ");
        int inputValue = scanner.nextInt();

        executeFunction(questionNumber, inputValue);

        scanner.close();
        
    }

    public static void executeFunction(int questionNumber, int inputValue) {
        switch (questionNumber) {
            case 1:
                new que1(inputValue);
                break;
            case 2:
                new que2(inputValue);
                break;
            case 3:
                new que3(inputValue);
                break;
            case 4:
                new que4(inputValue);
                break;
            case 5:
                new que5(inputValue);
                break;
            case 6:
                new que6(inputValue);
                break;
            case 7:
                new que7(inputValue);
                break;
            case 8:
                new que8(inputValue);
                break;
            case 9:
                new que9(inputValue);
                break;
            case 10:
                new que10(inputValue);
                break;
            case 11:
                new que11(inputValue);
                break;
            case 12:
                new que12(inputValue);
                break;
            case 13:
                new que13(inputValue);
                break;
            case 14:
                new que14(inputValue);
                break;
            case 15:
                new que15(inputValue);
                break;
            case 16:
                new que16(inputValue);
                break;
            case 17:
                
            	new que17(inputValue);// Add code to handle question 17 with inputValue
                break;
            case 18:
                new que18(inputValue);
                break;
            case 19:
               // Add code to handle question 19 with inputValue
            	new que19(inputValue);
                break;
            case 20:
                // Add code to handle question 20 with inputValue
            	new que20(7);
            	break;
            case 21:
                new que21(inputValue);
                break;
            case 22:
                new que22(inputValue);
                break;
            case 23:
                new que23(inputValue);
                break;
            case 24:
                new que24(inputValue);
                break;
            case 25:
                new que25(inputValue);
                break;
            case 26:
                new que26(inputValue);
                break;
            case 27:
                new que27(inputValue);
                break;
            case 28:
            	 new que28(inputValue);
                 break;
            case 29:
           	 new que29(inputValue);
                break;
            case 30:
              	 new que30(inputValue);
                   break;
            case 31:
             	 new que31(inputValue);
                  break;
            case 32:
            	 new que32(inputValue);
                 break;
            case 33:
           	 new que33(inputValue);
                break;
            default:
                System.out.println("Invalid question number");
                break;
        }
    }
}
