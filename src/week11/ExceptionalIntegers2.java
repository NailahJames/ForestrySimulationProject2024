package week11;
import java.util.ArrayList;
//======================================================================================================================
public class ExceptionalIntegers2 {
//======================================================================================================================
 //----main method
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (String arg : args) {
            try {
                Integer integer = converter(arg);
                integers.add(integer);
            } catch (NumberFormatException e) {
                System.out.println("Catch block says the argument \"" + arg + "\" is ignored because " + e.getMessage());
            }
        }

        System.out.println("\nVector contents are:");
        int index;
        for (index = 0; index < integers.size(); index++) {
            System.out.println("Item " + index + " is " + integers.get(index));
        }
    }

 //----converter method
    private static Integer converter(String str) throws NumberFormatException {
        int value = Integer.parseInt(str);
        System.out.println("Converter method says integer OK - " + value);
        return value;
    }//end of conveter method
}//end of ExceptionalIntergers2 class
