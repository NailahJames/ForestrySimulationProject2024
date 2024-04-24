import java.io.*;
import java.util.ArrayList;
import java.io.IOException;

/**
 This is the class for what a Forest object looks like.
 @author Nailah James
 @serial
 @see Forest
 */
class Forest implements Serializable{
    /**
     * A private static final double for the smallest amount of growth rate a tree can have.
     */
    private static final double MINIMUM_GROWTH_RATE = 0.1;
    /**
     * A private static final double for the increase of the tree height.
     */
    private static final double INCREASE_TREE_HEIGHT_WHOLE_NUMBER = 1;
    /**
     * A private static final int for the growth rate to be turned into a whole number.
     */
    private static final int MAKE_GROWTH_RATE_WHOLE = 100;
    /**
     * A private static final int for the year of planting for 25.
     */
    private static final int YEAR_OF_PLANTING_TWENTY_FIVE = 25;
    /**
     * A private static final int for the yearOfPlanting to be in the 2000s
     */
    private static final int YEAR_TWO_THOUSAND = 2000;
    /**
     * A private static final for the minimum height the tree can grow.
     */
    private static final double MINIMUM_HEIGHT = 10.0;
    /**
     * A private static final for the maximum height the tree can grow.
     */
    private static final double MAXIMUM_HEIGHT = 20.0;
//----------------------------------------------------------------------------------------------------------------------
//----Data objects
    /**
     * A private String for the Forest class for the name of the Forest/file.
     */
    private String name;
    /**
     * A private ArrayList<> for the Forest class to store the trees.
     */
    private ArrayList<Tree> trees;

//----------------------------------------------------------------------------------------------------------------------
    /**
     *Initializes the name and the ArrayList<>.
     * @param name The name of the forest.
     * @see Forest
     */
//----Constructor method
    public Forest(String name) {
        this.name = name;
        trees = new ArrayList<>();
    }//end of Forest constructor
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Getter method for the name
     * @return The name of the forest.
     * @see Forest
     */
//----Getter method for the name
    public String getName() {
        return name;
    }//end of getName method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Adds a tree to the ArrayList<> tree.
     * @param tree A tree of type Tree
     * @see Forest
     */
//----addTree method to add a tree
    public void addTree(Tree tree) {
        trees.add(tree);
    }//end of addTree method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Adds a random tree.
     * @return A new randomly generated tree
     * @see Forest
     */
//----addRandomTree method to add a RANDOM tree
    public Tree addRandomTree() {
        int yearOfPlanting;
        double randomHeight;
        double growthRate;

        Tree.TreeSpecies[] speciesValues = Tree.TreeSpecies.values();
        Tree.TreeSpecies randomSpecies = speciesValues[(int) (Math.random() * speciesValues.length)];
        yearOfPlanting = (int) (Math.random() * YEAR_OF_PLANTING_TWENTY_FIVE) + YEAR_TWO_THOUSAND;
        randomHeight = MINIMUM_HEIGHT + Math.random() * (MAXIMUM_HEIGHT - MINIMUM_HEIGHT);
    //----This will give us the random growth rate between 10% and 20%
        growthRate = MINIMUM_GROWTH_RATE + Math.random() * (MINIMUM_GROWTH_RATE * 10);

        Tree newTree = new Tree(randomSpecies, yearOfPlanting, randomHeight, growthRate);
        trees.add(newTree);
        return newTree;
    }//end of addRandomTree method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * A method to cut the specified tree.
     * @param index Index of the tree that wil be cut
     * @exception NumberFormatException Catches the index to see if it's actually an integer
     * @see Forest
     */
//----cutTree method to cut a tree
    public void cutTree(int index) {
        try {
            if (trees.isEmpty()) {
                System.out.println("There are no trees to cut.");
                return;
            }

            if (index < 0 || index >= trees.size()) {
                System.out.println("Tree number " + index + " does not exist.");
                return;
            }

            trees.remove(index);
            System.out.println("Tree number " + index + " removed.");
        } catch (NumberFormatException e) {
            System.out.println("That is not an integer");
        }
    }//end of cutTree method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Makes the specified tree simulate an actual tree growing.
     * @see Forest
     */
//----simulateGrowth method to simulate growth of all trees
    public void simulateGrowth() {
        double growthPercentage;
        double newHeight;
        int index;
        Tree tree;

        for (index = 0; index < trees.size(); index++) {
            tree = trees.get(index);
            growthPercentage = (Math.random() * MINIMUM_GROWTH_RATE * MINIMUM_HEIGHT) + MINIMUM_GROWTH_RATE;
            newHeight = tree.getHeight() * (INCREASE_TREE_HEIGHT_WHOLE_NUMBER + growthPercentage);
            tree.setHeight(newHeight);
            tree.setGrowthRate(growthPercentage * MAKE_GROWTH_RATE_WHOLE);
        }
    }//end of simulateGrowth method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Reaps the trees.
     * @param heightChosen The height the user wants to reap from
     * @see Forest
     */
//----reapTrees method to reap trees taller than a specified height
    public void reapTrees(double heightChosen) {
        ArrayList<Tree> removedTrees = new ArrayList<>();
        int index;
        int jindex;
        Tree tree;
        Tree removedTree;
        Tree newTree;

        for (index = 0; index < trees.size(); index++) {
            tree = trees.get(index);
            if (tree.getHeight() >= heightChosen) {
                removedTrees.add(tree);
            }
        }

        for (jindex = 0; jindex < removedTrees.size(); jindex++) {
            removedTree = removedTrees.get(jindex);
            System.out.printf("Reaping the tall tree  %-8s %-6d %.2f'  %.1f%%\n",
                    removedTree.getSpecies(), removedTree.getYearOfPlanting(),
                    removedTree.getHeight(), removedTree.getGrowthRate());
            trees.remove(removedTree);

            // Add new trees to replace the reaped ones
            newTree = addRandomTree();
            System.out.printf("Replaced with new tree %-8s %-6d %.2f'  %.1f%%\n",
                    newTree.getSpecies(), newTree.getYearOfPlanting(),
                    newTree.getHeight(), newTree.getGrowthRate());
        }

        System.out.println();
    }//end of reapTrees method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Saves the forest the user is working on.
     * @param forest The forest the user wants to save
     * @see Forest
     */
//----saveForest() method to save the forest to files
    public static boolean saveForest(Forest forest) {
        ObjectOutputStream toStream = null;
        String fileName = forest.name + ".db";

        try {
            toStream = new ObjectOutputStream(new FileOutputStream(fileName));
            toStream.writeObject(forest);
            return true;

        } catch (IOException e) {
            System.out.println("Error saving forest " + e.getMessage());
            return(false);
        } finally {
            if (toStream != null) {
                try {
                    toStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//end of saveForest() method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Loads the forest the user wants.
     * @param fileName The name of the file the user want to load
     * @see Forest
     */
//----loadForest() method to load the forest specified by user
    public static Forest loadForest(String fileName) {
        ObjectInputStream fromStream = null;

        try {
            fromStream = new ObjectInputStream(new FileInputStream(fileName));
            Forest forest = (Forest) fromStream.readObject();
            return forest;
    //----The file has already been closed
        } catch (EOFException e) {
            // Ignore it - we came to end of file. That's fine.
            return null;
    //----Checks if the file exists or not
        } catch (FileNotFoundException e) {
            System.out.println("Error opening/reading " + fileName);
            return null;
    //----Checks if the class exists
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ERROR: Loading forest: " + e.getMessage());
            return null;
    //----Closes the file and checks if the file closed properly
        } finally {
            if (fromStream != null) {
                try {
                    fromStream.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Closing file: " + e.getMessage());
                }
            }
        }
}//end of loadForestClass
//----------------------------------------------------------------------------------------------------------------------
    /**
     *Prints the forest.
     * @see Forest
     */
//----printForest method to print the current forest
    public void printForest() {
        double totalHeight = 0.0;
        int index;

        System.out.println("Forest name: " + name);
        for (index = 0; index < trees.size(); index++) {

            System.out.println("   " + index + " " + trees.get(index));


            totalHeight += trees.get(index).getHeight();
        }
        System.out.printf("There are %d trees, with an average height of %.2f\n", trees.size(), totalHeight / trees.size());
    }//end of printForest method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * READS the CSV files as a Forest type.
     * @param fileName The name of the file to read from CSV
     * @return forest Returns the forest that is read
     * @exception FileNotFoundException Displays when there is an error opening the file
     * @exception IOException Displays when there is an error reading the file
     * @exception IllegalArgumentException Displays when there is an invalid tree species
     * @see Forest
     */
//----readForestFromCSV() method to read files like Montane and Acadian
    public static Forest readForestFromCSV(String fileName) {
        Forest forest = new Forest(fileName);

    //----BufferedReader
        try (BufferedReader inFile = new BufferedReader(new FileReader(fileName + ".csv"))) {
            String line;
            while ((line = inFile.readLine()) != null) {


                String[] parts = line.split(",");
                String speciesStr = parts[0].toUpperCase(); // Convert to uppercase to match enum constants
                Tree.TreeSpecies species = Tree.TreeSpecies.valueOf(speciesStr);
                int yearOfPlanting = Integer.parseInt(parts[1]);
                double height = Double.parseDouble(parts[2]);
                double growthRate = Double.parseDouble(parts[3]);

                Tree tree = new Tree(species, yearOfPlanting, height, growthRate);
                forest.addTree(tree);
            }

    //----Catch-try to gracefully handle any wrong inputs
        } catch (FileNotFoundException e) {
            System.out.println("Error opening/reading " + fileName + ".csv");
            return null;
        } catch (IOException e) {
            System.out.println("Error reading forest: " + e.getMessage());
            return null;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid tree species in the CSV file.");
            return null;
        }
        return forest;
    }
//----------------------------------------------------------------------------------------------------------------------
//======================================================================================================================
}//end of Forest class
//======================================================================================================================



