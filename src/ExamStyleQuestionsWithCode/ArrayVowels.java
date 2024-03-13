package ExamStyleQuestionsWithCode;

public class ArrayVowels {
    public static void main(String[] args) {
        char[] arrayVowels = {'a', 'e', 'i', 'o', 'u'};

        printVowels(arrayVowels);
    }

    public static void printVowels(char[] array) {
        int index;
        for (index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}