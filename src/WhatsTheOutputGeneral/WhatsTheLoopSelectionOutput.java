package WhatsTheOutputGeneral;

public class WhatsTheLoopSelectionOutput {
    //-------------------------------------------------------------------------------------------------
    private static final short PLANTATION = 9;
    private static final short HIGH = 42;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int poppySeed = 27;
        int mountainPass;
        int steps;

        mountainPass = HIGH;
        System.out.println("The mountain pass starts at " + mountainPass);
        while (poppySeed < 4 * PLANTATION) {//while 27 < 36
            if (poppySeed < PLANTATION || poppySeed % 2 == 1) {
                mountainPass = poppySeed % 6;
                for (steps = 0; steps < mountainPass; steps++) {
                    poppySeed += steps;
                }
                poppySeed -= --mountainPass;
                System.out.println("Low price per KG is " + poppySeed);
            } else {
                do {
                    poppySeed += mountainPass;
                    mountainPass = mountainPass * mountainPass;
                } while (mountainPass <= PLANTATION);
                System.out.println("High price per KG is " + poppySeed);
                poppySeed = HIGH;
            }
        }
        System.out.println("The mountain pass ends at " + mountainPass);
    }
//-------------------------------------------------------------------------------------------------
}
