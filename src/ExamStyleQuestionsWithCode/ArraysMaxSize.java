package ExamStyleQuestionsWithCode;

public class ArraysMaxSize {
    public static void main(String[] args) {
        final int MAX_SIZE = 10;
        int[] array = new int[MAX_SIZE];
        int index;

        //Intializes every element to 0
        for (int i = 0; i < MAX_SIZE; i++) {
            array[i] = 0;
        }

        // Print the array elements
        for (index = 0; index < MAX_SIZE; index++) {
            System.out.println("array[" + index + "]: " + array[index]);
        }
    }
}
