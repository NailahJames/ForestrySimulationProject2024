package WhatsTheOutputGeneral;

public class WhatsTheArrayOutput {
    //=============================================================================
        //-----------------------------------------------------------------------------
        private static final int NUMBER_OF_GOBLINS = 2;
        //-----------------------------------------------------------------------------
        public static void main(String[] args) {

            final int[] magic = {4,3,2,1};
            int[] potionPot = new int[NUMBER_OF_GOBLINS];
            int blackCat;
            int ratsBlood;
            int witchBrew;

            for (blackCat = 0; blackCat < potionPot.length; blackCat++) {
                potionPot[blackCat] = 0;
                ratsBlood = blackCat;
                while (ratsBlood < magic.length) {
                    potionPot[blackCat] += magic[ratsBlood];
                    ratsBlood += (blackCat + 1);
                }
            }

            System.out.print("The magic ingredients are ");
            for (blackCat = 0; blackCat < potionPot.length; blackCat++) {
                System.out.print(potionPot[blackCat] + "  ");
            }
            System.out.println();

            witchBrew = magic[potionPot[0] % magic.length];
            System.out.println("The antidote is " + witchBrew);
        }
//-----------------------------------------------------------------------------
    }
//=============================================================================

