package calculator;

/**
 * Description: That's the library of the Calculator program. The goal is storage the methods.
 * 
 * @author: Bernardo Nilson
 * @version: 29.04.2023
 * 
 */

public class Library {
    
    public static double calculateAddition (double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public static double calculateSubtraction (double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public static double calculateMultiplication (double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    public static double calculateDivision (double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

    public static void waitTime(int milisseconds) throws InterruptedException {
        try {
            Thread.sleep(milisseconds);
        } catch (InterruptedException e) {
            if (Thread.interrupted()) throw new InterruptedException();
            e.printStackTrace();
        }
    }
}
