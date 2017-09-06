package notes;
import java.util.Scanner;
 
/**
 * Write a description of class CH3_Notes_1 here.
 * 
 * Created to cover concepts presented in Chapter 3, sections 3.0-3.2 (conditionals)
 * 
 * @author D. Appel
 * @version 1
 */
public class CH3_Notes_1
{
    public static int getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        return scan.nextInt();
    }
     
    public static void ifStatements(){
        int num = getInput();
         
        // Without braces (avoid)
        if (num == 3)
            System.out.println("You entered 3");
         
            System.out.println("This is not attached to the if statement");
             
        //  1.  Start with just if statement
        if (num == 2) {
            System.out.println("You entered two!");
        }
        // 3.  Add else if statement
        else if (num % 2 == 0) {
            System.out.println("Your number is even!");
        }
        // 2. Create else statement
        else {
            System.out.println("You didn't enter two.");
        }
    }
     
    public static void nestedConditionals() {
        int num = getInput();
         
        if (num % 3 == 0) {
            System.out.println("Your number is divisble by 3");
            if (num % 4 == 0) {
                System.out.println("Your number is also divisble by 4");
                System.out.println("Your number is divisble by 12");  //Show that putting in 4 won't get here
            }
        }
        else {
            System.out.println("You didn't enter a multiple of 12");
        }
         
        //If you don't use braces you will have issues:
        if (num >0)
            if ( num % 2 == 0)
                System.out.println("This is a positive even number");
         
        else
            System.out.println("This is not a positive number"); //attached to nearest if statement (not indent level)
    }
     
     
    public static void compoundConditionals() {
        int num = getInput();
         
        if (num % 3== 0 && num %4 ==0) {
            System.out.println("You entered a multiple of 12");
        }
        else {
            System.out.println("You didn't enter a multiple of 12");
        }
    }
     
    //Look at the debugger and step through this.  Then look at the book problems in notes
}