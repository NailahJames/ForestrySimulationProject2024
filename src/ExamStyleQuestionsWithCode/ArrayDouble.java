package ExamStyleQuestionsWithCode;

public class ArrayDouble {
    public static void main(String[] args) {
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        initializeDoubleArrayToZero(doubleArray);

        // Print the array elements
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("doubleArray[" + i + "]: " + doubleArray[i]);
        }
    }

    //The method used to make all the vsalue sin doubleArray initialize to 0
    public static void initializeDoubleArrayToZero(double[] array) {
        int index;

        for (index = 0; index < array.length; index++) {
            array[index] = 0.0;
        }
    }
}
