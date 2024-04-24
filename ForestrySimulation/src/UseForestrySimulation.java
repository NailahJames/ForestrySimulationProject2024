import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 This is the driver class to run the Forestry Simulation.
 @author Nailah James
 @see UseForestrySimulation
 */
//======================================================================================================================
public class UseForestrySimulation {
//----------------------------------------------------------------------------------------------------------------------
    /**
     *private static final Scanner to get user input.
     */
    private static final Scanner keyboard = new Scanner(System.in);

//----------------------------------------------------------------------------------------------------------------------
    /**
     * Main method for the driver class.
     * @param args The command line argument
     * @see UseForestrySimulation
     */
    //----Main() method
    public static void main(String[] args) {
        System.out.println("Welcome to the Forestry Simulation");
        System.out.println("----------------------------------");
        int index;

    //----Starts to read the CSV files
        for (index = 0; index < args.length; index++) {
            String arg = args[index];
            System.out.println("Initializing from " + arg);
            Forest currentForest = Forest.readForestFromCSV(arg);
            if (currentForest != null) {
                menu(currentForest);
            }
        }

        System.out.println("Exiting the Forestry Simulation");
    }//end of the main method
//----------------------------------------------------------------------------------------------------------------------
    /**
     *Gives the user the option of action.
     * @param forest The forest that will be worked on
     * @see UseForestrySimulation
     */
//----menu() method to let the user choose what action they'd like
    private static void menu(Forest forest) {
        boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.print("(P)rint, (A)dd, (C)ut, (G)row, (R)eap, (S)ave, (L)oad, (N)ext, e(X)it : ");

            String userInput = keyboard.next().toUpperCase();
            switch (userInput) {
                case "A":
                    forest.addRandomTree();
                    break;

                case "P":
                    System.out.println();
                    forest.printForest();
                    break;

                case "C":
                    int indexToCut;

                    while (true) {
                        System.out.print("Tree number to cut down: ");
                        try {
                            String input = keyboard.next();
                            indexToCut = Integer.parseInt(input);
                            keyboard.nextLine();
                            forest.cutTree(indexToCut);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("That is not an integer");
                            keyboard.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("That is not an integer");
                            keyboard.nextLine();
                        }
                    }
                    break;

                case "G":
                    forest.simulateGrowth();
                    break;

                case "R":
                    double heightChosen;

                    while (true) {
                        System.out.print("Height to reap from: ");
                        try {
                            String input = keyboard.next();
                            heightChosen = Double.parseDouble(input);
                            keyboard.nextLine();
                            forest.reapTrees(heightChosen);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("That is not a valid number");
                            keyboard.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("That is not a valid number");
                            keyboard.nextLine();
                        }
                    }
                    break;

                case "S":
                    boolean saved = Forest.saveForest(forest);

                    if (saved) {
                        System.out.println("Forest saved successfully.");
                    } else {
                        System.out.println("Failed to save forest.");
                    }
                    break;

                case "L":
                    boolean loadForest = true;

                    System.out.print("Enter forest name: ");
                    String forestName = keyboard.next();
                    String fileName = forestName + ".db";
                    File file = new File(fileName);
                    if (!file.exists()) {
                        System.out.println("Error opening/reading " + fileName);
                        System.out.println("Old forest retained");
                        loadForest = false;
                    }
                    if (loadForest) {
                        forest = Forest.loadForest(fileName);
                    }
                    break;
                case "N":
                    System.out.println("Moving to the next forest");
                    exit = true;
                    break;
                case "X":
                    exit = true;
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option menu option. Try again");
                    break;
            }
        }
    }//end of menu() method
//----------------------------------------------------------------------------------------------------------------------
}//end of the class
//======================================================================================================================