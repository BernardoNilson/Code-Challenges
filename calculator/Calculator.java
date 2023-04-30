package calculator;

/**
 * Understanding the problem: Write a program that receive two number of the user and
 * the operation that they want. After that, write the result. PS: The program need to still running
 * until the user write "END" in the Scanner.
 * 
 * @author: Bernardo Nilson
 * @version: 29.04.2023
 * Inicial version, just using basic code skills.
 * 
 */

import java.util.*;

public class Calculator {

    public static void main(String[] args) throws InterruptedException {

        //Open the Scanner object
        Scanner scan = new Scanner(System.in);

        //The first line put the pointer in the right place
        System.out.print("\033\143");
        System.out.println("Nice to meet you! This program is a simple calculator. If you want to stop, just write \"END\" in the terminal");
        
        //Variable declarations
        String operation = "";
        double firstNumber, secondNumber;
        int operator;
        double result = 0;
        byte i = 1;
        
        //Infinite loop to never stop the program, until the user write "END"
        while (i > 0){

            //The try - catch is need to put the exception for END
            try {
                System.out.println("\nPlease, insert your first number: ");
                firstNumber = scan.nextDouble();
                
                System.out.println("\nNow, the second one: ");
                secondNumber = scan.nextDouble();

                System.out.println("\nLast but not least, the operator: \nOptions:\n 1 - Addition\n 2 - Subtraction\n 3 - Multiplication\n 4 - Division");
                operator = scan.nextInt();

                //To avoid uses a lot of IF/ELSE, I choose switch case. Each case call a method
                switch (operator) {
                case 1:
                result = Library.calculateAddition(firstNumber, secondNumber);
                operation = "+";
                break;
                case 2:
                result = Library.calculateSubtraction(firstNumber, secondNumber);
                operation = "-";
                break;
                case 3: 
                result = Library.calculateMultiplication(firstNumber, secondNumber);
                operation = "x";
                break;
                case 4:
                result = Library.calculateDivision(firstNumber, secondNumber);
                operation = "/";
                break;
                default: 
                System.out.println("Hey, something is wrong here!");
                System.exit(0);
                }

                System.out.println("\nOh, that's so hard... Just a minute...");

                //This methods is implement to wait for five seconds
                Library.waitTime(5000);

                System.out.println("\nThe expression was: " + firstNumber + " " + operation + " " + secondNumber + "\nResult: " + result);

            } catch (InputMismatchException e) { 
                String exceptionString = scan.next(); //This line put the exception into a String variable
                //If the exception is exactly the word END, just stops the program.
                if (exceptionString.equals("END")) {
                    System.exit(0);
                }
            }
        }

        //Closes the Scanner
        scan.close();
        
        // END
    }
}
