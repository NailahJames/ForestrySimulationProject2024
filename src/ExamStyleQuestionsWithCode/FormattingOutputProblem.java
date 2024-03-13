package ExamStyleQuestionsWithCode;

public class FormattingOutputProblem {

    public static void main(String[] args) {
        int favourite = 27;
        double somethingAccurate = 1234.56789;
        boolean tomatoesAreGreen = false;
        char bigA = 'A';

        System.out.printf("Decimal: %4d\n", favourite);
        System.out.printf("Left J : %-4d\n", favourite);
        System.out.printf("0 fill : %04d\n", favourite);
        System.out.printf("Octal  : %4o\n", favourite);
        System.out.printf("Hex    : %4x\n", favourite);
        System.out.printf("Decimal: %8.2f\n", somethingAccurate);
        System.out.printf("Science: %8.2e\n", somethingAccurate);
        System.out.printf("Boolean: %-10b\n", tomatoesAreGreen);
        System.out.printf("Char   : %3c\n", bigA);
        System.out.printf("String : %-10s %10s\n", "hello", "world");
        System.out.printf("Mixed  : %4d and a large %c gives %d%% for $%.2f\n",
                favourite, bigA, favourite, somethingAccurate);
    }
}
