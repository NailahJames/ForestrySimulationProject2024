package week4;


import java.util.Scanner;
//===========================================================================
//---Public Class NitroxScuba and the constants present
public class NitroxScuba {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int FEET_PER_ATMOSPHERE_CONSTANT = 33;
    private static final double MAXIMAL_PARTIAL_PRESSURE_OF_OXYGEN = 1.4;
    private static final double CONTINGENCY_MAXIMAL_PARTIAL_PRESSURE_OF_OXYGEN = 1.6;

//---------------------------------------------------------------------------
//----integers depth, percentage of O2 ... doubles of ambient pressure & O2 pressure ... booleans for max and continge
        public static void main(String[] args) {
            int depth;
            int percentageOxygen;
            double ambientPressure;
            char oxygenPressureGroup;
            boolean exceedsMaximalOxygenPressure;
            boolean exceedsContingencyOxygenPressure;

            System.out.print("Enter depth and percentage O2: " );
            depth = keyboard.nextInt();
            percentageOxygen = keyboard.nextInt();

    //----Calling the method
            ambientPressure = ((double) depth / FEET_PER_ATMOSPHERE_CONSTANT) + 1;
            double o2Pressure = computePartialPressureOfOxygen(percentageOxygen, ambientPressure);
            oxygenPressureGroup = displayWarnings(o2Pressure);
            exceedsMaximalOxygenPressure = OpgStatus1((double) o2Pressure);
            exceedsContingencyOxygenPressure = OpgStatus2((double) o2Pressure);


    //----Printing the outputs
            System.out.println("Ambient Pressure: " + ambientPressure);
            System.out.println("O2 Pressure: " + o2Pressure);
            System.out.println("O2 Group: " + oxygenPressureGroup);
            System.out.println("Exceeds maximal O2 pressure: " + exceedsMaximalOxygenPressure);
            System.out.println("Exceeds contingency O2 pressure: " + exceedsContingencyOxygenPressure);

        } // end of main method
//----------------------------------------------------------------------------
    //----Start of computePpo2 method (Finds the partial pressure of oxygen)
    private static double computePartialPressureOfOxygen(int percentageO2, double ambientPressure) {

            double partialPressureOfOxygen;
            partialPressureOfOxygen = ( percentageO2 / 100.0) * ambientPressure;
            return partialPressureOfOxygen;

    }// end of computePpo2 method
//----------------------------------------------------------------------------
    //----Start of displayWarnings method
    private static char displayWarnings(double o2Pressure) {
            double oxygenPressure = 0;
            char oxygenPressureGroup = (char) (('B' + (int) (o2Pressure / 0.1)) - 1);


        return oxygenPressureGroup;
    } // end of displayWarnings method
// ---------------------------------------------------------------------------
    //----Start of OpgStatus methods
    private static boolean OpgStatus1(double o2Pressure) {
            boolean exceedsMaximalOxygenPressure = o2Pressure > MAXIMAL_PARTIAL_PRESSURE_OF_OXYGEN;
            return exceedsMaximalOxygenPressure;

        }//end of OpgStatus1 method

    private static boolean OpgStatus2 (double o2Pressure) {
            boolean exceedsContingencyOxygenPressure = o2Pressure > CONTINGENCY_MAXIMAL_PARTIAL_PRESSURE_OF_OXYGEN;
            return exceedsContingencyOxygenPressure;

    } // end of OpgStatus2 method
//-----------------------------------------------------------------------------
}  // end of class Nitrox Scuba
