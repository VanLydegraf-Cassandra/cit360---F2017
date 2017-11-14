package appconpat;

import java.util.Scanner;

/**
 *
 * @author Cassandra
 */
public class AppConPat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create instance of deligate
        appController deligate = new appController();
        
        //create variable list
        String add = "add";
        String subtract = "subtract";
        String multiply = "multiply";
        String divide = "divide";
        Integer firstNumber = -1;
        Integer secondNumber = 1;
        String command;
        
        // implement scanner to collect user input
        Scanner myScanner = new Scanner(System.in);
        
        // ask user for the first number they would like to use
        System.out.print("Enter a number please:");
        // collect user input as firstNumber
        firstNumber = Integer.parseInt(myScanner.nextLine());
        
        // ask user for the calculation command they would like to use
        System.out.print("Enter a command please(+, *, -, /):");
        // collect user input as command
        command = myScanner.nextLine();
        
        // ask user for the second number they would like to use
        System.out.print("Enter another number please:");
        // collect user input as secondNumber
        secondNumber = Integer.parseInt(myScanner.nextLine());
        
        // output the equation the user has created and the answer
        System.out.print(firstNumber + " " + command + " " + secondNumber + " = ");
        deligate.handleCommand(command, firstNumber, secondNumber);
    }
    
}
