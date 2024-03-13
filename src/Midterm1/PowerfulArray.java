package Midterm1;

public class PowerfulArray {
    private static final int NUMBER_OF_ELEMENTS = 6;
    private static final int POWER_EXPONENT = 3;
    //-------------------------------------------------------------
    public static void main(String[] args) {

//----Provide the missing lines that go here
        double [] array = new double [NUMBER_OF_ELEMENTS];

        int index;

        for (index = 0; index < NUMBER_OF_ELEMENTS; index++) {

            array[index] = Math.pow(index, POWER_EXPONENT);

        }
    }
}
