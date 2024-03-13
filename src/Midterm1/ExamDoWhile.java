package Midterm1;

public class ExamDoWhile {
    private static final int QUARTERLY_WAY = 2;
    private static final int HALFWAY = 5;
    private static final int ALL_THE_WAY = 8;

    public static void main(String[] args) {
        int numberOfValues =0;
        int total = 0;
        boolean madeIt;

        do {
            numberOfValues++;
            while(numberOfValues < HALFWAY){
                total += numberOfValues;
                numberOfValues++;
            }
             madeIt = (total - numberOfValues) % 3 == 0;
            numberOfValues -= QUARTERLY_WAY;
            System.out.println(total + " " + numberOfValues + " " + madeIt);
        } while((total - HALFWAY) < ALL_THE_WAY);
    }
}
