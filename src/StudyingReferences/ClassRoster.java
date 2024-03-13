package StudyingReferences;
import java.util.Scanner;

public class ClassRoster {//This program hold's all the names of a classroom
    private static final Scanner keyboard = new Scanner(System.in);
    private final static int NUMBER_OF_KIDS = 10;

        private static String[] classmateNames;

        public static void main (String[]args){
            classmateNames = new String[NUMBER_OF_KIDS];
            System.out.println("The Roster:\n-----------");
            getClassmateNames();
            printClassRoster();
        }

        private static void getClassmateNames() {
            System.out.println("Print out the names of the class: ");
            for (int index = 0; index < NUMBER_OF_KIDS; index++) {
                classmateNames[index] = keyboard.nextLine();
            }
        }

        private static void printClassRoster () {
            for (String name : classmateNames) {
                System.out.println(name);
            }
        }

    }
