package week3;

import java.util.Scanner;

//================================================================================
public class KillingKangaroos {
    private static final Scanner keyboard = new Scanner(System.in);
//================================================================================
    //----Making the probability constant of 'roos killed
    private static final double PROBABILITY_CONSTANT = 1.47;
    private static final double WIDTH = 0.01;
    //----Variables of length of side land, length of road, number of 'roos,expected number of kills, road surface
        public static void main (String[] args) {
            double lengthOfSideLand;
            double lengthOfRoad;
            int numOfRoos;
            double landArea;
            int expectedNumOfKills;
            double rooDensity;
            double roadSurface;
            int expectedNumOfInjuries;

            System.out.print("Enter side of square in km: ");
            lengthOfSideLand = keyboard.nextDouble();
            System.out.print("Enter roads length in km: ");
            lengthOfRoad = keyboard.nextDouble();
            System.out.print("Enter number of 'roos: ");
            numOfRoos = keyboard.nextInt();
//================================================================================
    //----Calculating expected number of kills and injuries
            landArea = (lengthOfSideLand * lengthOfSideLand);
            rooDensity = numOfRoos / landArea;
            roadSurface = lengthOfRoad * WIDTH;
            double numberOfKangarooKilledAndInjured = (rooDensity * roadSurface * PROBABILITY_CONSTANT);
            expectedNumOfKills = (int)(numberOfKangarooKilledAndInjured);
            expectedNumOfInjuries = (int)(Math.ceil(numberOfKangarooKilledAndInjured % 1));
//================================================================================
    //----Outputting the inputs and calculations of expected number of kills
        System.out.println("Expected number of kills is: " + expectedNumOfKills);
        System.out.print("Expected number of injuries: " + expectedNumOfInjuries);
        }//----end of main method

}//----end of class KillingKangaroos
