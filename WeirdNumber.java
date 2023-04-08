/**
 * Problema: Given an integer N as input, can you check the following:
 * - If N is odd, then print "Weird".
 * - If N is even and, in between range 2 and 5 (inclusive), print "Not Weird".
 * - If N is even and, in between range 6 and 20 (inclusive), print "Weird".
 * - If N is even and N > 20, print "Not Weird".
 * @author: Bernardo Nilson
 * @version: 08.04.2023
 * Improved version... from CodeWhiz.java October 2015 - Hacker Rank
 * 
 */

import java.util.*;

public class WeirdNumber {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        //Here, the user can insert their number.
        System.out.println("Please, insert your number: ");
        int number = scan.nextInt();

        //This line close the scanner.
        scan.close();

        //This part calculates the number enunciate.
        if (number % 2 != 0){
            System.out.print("This number is Weird");
        } else {
            if((number >= 2 && number <= 5) || (number > 20)){
                System.out.print("This number is Not Weird");
            } else {
                System.out.println("This number is Weird");
            }
        }

        //END
    }
    
}
