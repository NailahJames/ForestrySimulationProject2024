package Midterm1;

public class Midterm {
    private static final int MAX_MARK = 10;

    public static void main(String[] args) {
        int question;
        boolean pass;
        double fear;

        question = 13;
        fear = 7.3;

        pass = ((fear + MAX_MARK) < question + MAX_MARK % question || question / MAX_MARK > 0);
        fear = --question * fear;
        question *= 13 / 4;

        System.out.println(pass + " " + fear + " " + question);
    }
}
