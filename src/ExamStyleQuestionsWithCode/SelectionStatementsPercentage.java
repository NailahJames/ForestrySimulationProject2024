package ExamStyleQuestionsWithCode;
import java.util.Scanner;
public class SelectionStatementsPercentage {
    private static final Scanner keyboard = new Scanner(System.in);

        public static void main(String[] args) {
            double percentage = keyboard.nextDouble();
            boolean percentageCheckStatement = percentageCheck(percentage);
            System.out.println(" " + (percentageCheckStatement ? "Passed" : "Failed"));
        }

        public static boolean percentageCheck(double percentage) {
            if (percentage <= 50) {
                return false;
            } else {
                return true;
            }
        }
    }
