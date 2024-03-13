package ExamStyleQuestionsWithCode;
import java.util.Scanner;
public class CallingMethods {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String descriptiveWord;

        System.out.println("This is how to call a method. Now enter a descriptive word: ");
        descriptiveWord = keyboard.nextLine();
        System.out.println();
        displayMethodSentence(descriptiveWord);
    }
    public static void displayMethodSentence(String descriptiveWord) {
        System.out.println("This is me calling the method, " + descriptiveWord + ".");
    }




}
