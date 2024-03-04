package week7and8;

import java.util.Scanner;

public class IAm {

    private static final Scanner keyboard = new Scanner(System.in);

//=============================================================================================
//---------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String userqualities = "";
        String input;

        System.out.println("Please enter sentences, . to end.");

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        while (!input.equals(".")) {
            if (input.startsWith("I am ")) {
                userqualities += input.substring(5) + ", ";
            }

            input = scanner.nextLine();
        }

        if (userqualities.length() > 0) {
            userqualities = userqualities.substring(0, userqualities.length() - 2); // Remove the last comma and space
        }

        System.out.println("The qualities are " + userqualities);
        scanner.close();

//==============================================================================================
    }
}//end of IAm class