package week10;
//======================================================================================================================
public class Person {
//======================================================================================================================
//----------------------------------------------------------------------------------------------------------------------

//----Making data variables
    private String name;
    private int age;

//----Default constructor
    public Person () {
        this.name = "";
        this.age = 0;
    }


//----Constructor Person() to initialize name and age
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


//----toString() method to write out the sentence
    @Override
    public String toString(){
        return name + " is " + age + " years old";
    }

//----Mutator (setter) method to increment the age
    public void incrementAge() {
        age++;
    }


//----Accessor (getter) method to GET the name
    public String getName(){
        return name;
    }

//----Accessor method to GET the age
    public int getAge(){
        return age;
    }


//----------------------------------------------------------------------------------------------------------------------
//======================================================================================================================
}//end of Person class
//======================================================================================================================