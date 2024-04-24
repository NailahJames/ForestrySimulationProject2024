import java.io.Serializable;

//======================================================================================================================
/**
 This is the class for what a Tree object looks like.
 @author Nailah James
 @serial
 @see Tree
 */
class Tree implements Serializable {
//----------------------------------------------------------------------------------------------------------------------
//----enum for the species of  the tree (Maple, Birch, or Fir)
    /**
     * The enum for the species of the tree.
     */
    public static enum TreeSpecies { BIRCH, MAPLE, FIR };
//----------------------------------------------------------------------------------------------------------------------

//----Data objects
    /**
     * Data type for the TreeSpecies.
     */
    private TreeSpecies species;
    /**
     * private integer to hold the year the tree was planted.
     */
    private int yearOfPlanting;
    /**
     *  private double for the height of the tree.
     */
    private double height;
    /**
     * private double for the growth rate of the tree.
     */
    private double growthRate;
//------------------------------------------------------------------------------------------------------------------
    /**
     * Constructor method to initialize the data.
     */
//----Constructor method to initialize the data
    public Tree (TreeSpecies species, int yearOfPlanting, double height, double growthRate) {
        this.species = species;
        this.yearOfPlanting = yearOfPlanting;
        this.height = height;
        this.growthRate = growthRate;
    }//end of Tree constructor method
//------------------------------------------------------------------------------------------------------------------
    /**
     *Getter method for species.
     * @return The species of the tree
     */
//----Getter method for data object TreeSpecies
    public TreeSpecies getSpecies() {
        return species;
    }//end of getSpecies getter method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Getter method to get the year of planting.
     * @return The yearOfPlanting
     */
//----getter method for yearOfPlanting
    public int getYearOfPlanting() {
        return yearOfPlanting;
    }//end of getYearOfPlanting getter method
//----------------------------------------------------------------------------------------------------------------------
    /**
     *Getter method to get the height of the tree.
     * @return The height of the tree
     */
//----Getter method for height
    public double getHeight() {
        return height;
    }//end of getHeight getter method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Getter method to get the growth rate of the tree.
     * @return The growth rate of the tree
     */
//----Getter method for growthRate
    public double getGrowthRate() {
        return growthRate;
    }//end of getGrowthRate getter method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Setter method to set the species of TreeSpecies to species.
     */
//----Setter method for data object TreeSpecies
    public void setSpecies(TreeSpecies species) {
        this.species = species;
    }//end of setSpecies setter method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Setter method to set the year of planting  to the year of planting of the tree.
     */
//----Setter method for yearOfPlanting
    public void setYearOfPlanting(int yearOfPlanting) {
        this.yearOfPlanting = yearOfPlanting;
    }//end of setYearOfPlanting setter method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Setter method to set the height to the height of the tree.
     */
//----Setter method for height
    public void setHeight(double height) {
        this.height = height;
    }//end of setHeight setter method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * Setter method to set the growth rate to the growth rate of the tree.
     */
//----Setter method for growthRate
    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }//end of setGrowthRate setter method
//----------------------------------------------------------------------------------------------------------------------
    /**
     * This is to made sure the species, yearOfPlanting, height, and growthRate are displayed as strings.
     * My file would output some weird numbers and letter, so I tried this toString method to fix it.
     */
//----toString() method
    @Override
    public String toString() {
        return String.format("%-5s %4d %6.2f' %5.1f%%", species, yearOfPlanting, height, growthRate);
    }//end of toString() method
//----------------------------------------------------------------------------------------------------------------------
}//end of Tree class
//======================================================================================================================
