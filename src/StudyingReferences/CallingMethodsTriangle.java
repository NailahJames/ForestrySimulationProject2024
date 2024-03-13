package StudyingReferences;
import java.util.Scanner;
public class CallingMethodsTriangle {// I want this program to find the area of a triangle using methods
private static final Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        int base;
        int height;
        double area;

        System.out.print("Enter the base and height: " );
        base = keyboard.nextInt();
        height = keyboard.nextInt();

        area = AreaOfTriangle(base, height);
        DisplayArea(area);
    }
    public static double AreaOfTriangle(int base, int height) {
        double area = 0.5 * (base * height);
        return area;
    }
    public static void DisplayArea(double area) {
        System.out.printf("This is the area: " +  area);
    }
}
