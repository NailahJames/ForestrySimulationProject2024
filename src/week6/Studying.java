package week6;

import java.util.Scanner;

public class Studying {
    //========================================================================================
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int NUM_INPUTS = 5;

    //=========================================================================================
    public static void main(String[] args) {
        int[] grades = Grades();// 5. Create a new array to actually store those inputted numbers
        int index;

        System.out.println("These are the students' grades:");
        for (index = 0; index < grades.length; index++) { //6. create a for loop in order to constantly output something (depend on array length)
            System.out.println(" --> Value: " + grades[index]); /* 7. THIS IS WHAT WILL DISPLAY EACH ELEMENT
                                                                      Just do arrayName[index]
                                                                                                */
        }
    }

    public static int[] Grades() { //1. Make a method to get user elements/items
        System.out.print("Input the students' grades (enter 5): ");
        int[] studentGrades = new int[NUM_INPUTS]; // 2. MAKE THE ARRAY
        int index;

        for (index = 0; index < studentGrades.length; ++index) {// 3. To actually get input, MAKE A FOR LOOP
            studentGrades[index] = keyboard.nextInt();// use ARRAYNAME[INDEX] = KEYBOARD.NEXTINT();
        }
        return studentGrades;//4. Make a return statement of the  METHOD ARRAY NAME
    }




}


