package week6;

import java.util.Scanner;

public class week6PRACTICE {

private static final Scanner keyboard = new Scanner(System.in);

public static void main(String[] args) {
        int [] myArray = new int[5];
        int index;

        for (index = 0; index < myArray.length; index++) {
            System.out.println("Enter a number");
            myArray[index] = keyboard.nextInt();
        }

        for (index = 0; index < myArray.length; index++)
            System.out.println("The value at index" + index + "is" + myArray[index]);
    }

}
