package week10;

public class Family {
//======================================================================================================================
//----------------------------------------------------------------------------------------------------------------------
    private static final int MAX_PEOPLE = 10;
//======================================================================================================================

//----Data variables
    private Person[] people;
    private int numberOfPeople;



//----IO method to display
    public void display() {
        int index;

        for (index = 0; index < numberOfPeople; index++) {
            System.out.println(people[index]);
        }
    }

//----Default constructor to initialize the instance variables
    public Family() {
        this.people = new Person[MAX_PEOPLE];
        this.numberOfPeople = 0;
    }

//----Mutator method to add a person to the family
    public boolean addPerson (String name, int age) {
        if (numberOfPeople < 10) {
            people[numberOfPeople] = new Person(name, age);
            numberOfPeople++;
            return true;
        }
        else{
            return false;
        }
    }

//----Mutator method to change the birthday
    public void birthday(String name) {
        int index;

        for (index = 0; index < numberOfPeople; index++) {
            if (people[index].getName().equalsIgnoreCase(name)) {
                people[index].incrementAge();
                break;
            }
        }
    }

//----Accessor method to get the number of people in the family
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

//----Accessor method to return the totalAge of the family
    public int getTotalAge() {
        int totalAge = 0;
        int index;

        for(index = 0; index < numberOfPeople; index++) {
            totalAge += people[index].getAge();
        }
        return totalAge;
    }
//----------------------------------------------------------------------------------------------------------------------
//======================================================================================================================
}//end of Family class
//======================================================================================================================