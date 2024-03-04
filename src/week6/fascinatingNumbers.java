package week6;

import java.util.Scanner;
//=======================================================================================================
public class fascinatingNumbers {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int NUM_INPUTS = 10;
//=======================================================================================================
//-------------------------------------------------------------------------------------------------------
    //start of main method
    public static void main(String[] args) {
        int[] userValues = PromptingUser();
        int index;
        boolean isFibonacci;
        boolean isPrime;

    //----For loop to go through the entered numbers IN THE ARRAY repeatedly. Checks if fib or prime
        for (index = 0; index < userValues.length; index++) {
            if (userValues[index] == 0) {
                break;
            }

        //----sets booleans of Fib and Prime call methods IsFibonacci and IsPrime
            isFibonacci = IsFibonacci(userValues[index]);
            isPrime = IsPrime(userValues[index]);

        //----if statement in for loop to check with boolean methods if Fib or prime
            if (isFibonacci && isPrime) {
                System.out.println(userValues[index] + " is Fibonacci and prime");
            } else if (isFibonacci && !isPrime) {
                System.out.println(userValues[index] + " is Fibonacci and not prime");
            } else if (!isFibonacci && isPrime) {
                System.out.println(userValues[index] + " is not Fibonacci and is prime");
            } else if (!isFibonacci && !isPrime) {
                System.out.println(userValues[index] + " is not Fibonacci and is not prime");
            }
        }
    }// end of main method
//-------------------------------------------------------------------------------------------------------
    //start of PromptingUser method
    private static int[] PromptingUser() {
        System.out.print("Enter up to " + NUM_INPUTS + " numbers (0 to stop): "); //Prompting user to enter #'s
        int[] userValues = new int[NUM_INPUTS]; //array made where the input of values from user is stored
        int index = 0;
    //----do while loop to STOP NEGATIVE INPUT & allows input while index < 10. Runs at least once
        do {
            userValues[index] = keyboard.nextInt();
            if (userValues[index] == 0) {
                break;
            } else if (userValues[index] < 0) {
                System.out.println("Negative numbers are not allowed. Please enter a positive number instead.");
            } else {
                index++;
            }
        } while (index < NUM_INPUTS);

        return userValues;
    }// end of PromptingUser method
//------------------------------------------------------------------------------------------------------
    //start of IsFibonacci method
    private static boolean IsFibonacci(int number) {
        if (number < 10) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (b <= number) {
            if (b == number) {
                return true;
            }
            int saveNumber;

            saveNumber = a + b;
            a = b;
            b = saveNumber;
        }
        return false;
    }// end of IsFibonacci method
//------------------------------------------------------------------------------------------------------
    // start of IsPrime method
    private static boolean IsPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int index;
        for (index = 2; index <= Math.sqrt(number); index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    } // end of IsPrime method
//------------------------------------------------------------------------------------------------------
//======================================================================================================
} // end of fascinatingNumbers class
//======================================================================================================