package ExamStyleQuestionsWithCode;


public class Methods1 {

    public static void main(String[] args) {

        System.out.println(isAsciiGreaterThan('A', 65)); // true
        System.out.println(isAsciiGreaterThan('B', 65)); // false
        System.out.println(isAsciiGreaterThan('C', 65));
    }
    public static boolean isAsciiGreaterThan(char character, int integer) {
        int asciiValue = (int) character;
        return asciiValue > integer;
    }
}
