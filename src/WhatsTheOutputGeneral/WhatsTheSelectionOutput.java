package WhatsTheOutputGeneral;

public class WhatsTheSelectionOutput {
    //=================================================================================================

        //-------------------------------------------------------------------------------------------------
        private static final short PLANTATION = 9;
        //-------------------------------------------------------------------------------------------------
        public static void main(String[] args) {

            int poppySeed = 27;
            int mountainPass;

            poppySeed %= 14;

            if ((poppySeed - PLANTATION) > PLANTATION || PLANTATION - poppySeed > 0) {
                mountainPass = selectYourRuler(poppySeed % 3);
                System.out.print("Price per KG is " + poppySeed);
            } else {
                mountainPass = selectYourRuler(--poppySeed % 5);
                mountainPass += selectYourRuler(poppySeed++ % 5);
                System.out.println("Price per KG is " + (poppySeed+mountainPass));
            }
        }
        //-------------------------------------------------------------------------------------------------
        private static int selectYourRuler(int inchesOfIndex) {

            switch (inchesOfIndex) {
                case 0:
                case 3:
                    System.out.println("Workers unite");
                    break;
                case 2:
                    System.out.print("Workers rule");
                case 1:
                    System.out.println(" but rulers don't work");
                    break;
                case 5:
                    System.out.println("Hammers and sickles");
                    break;
                default:
                    System.out.println("Free the people");
                    break;
            }

            return(-inchesOfIndex);
        }
//-------------------------------------------------------------------------------------------------
    }
//=================================================================================================

