package week7and8;

public class Student {
    private String name;
    private double gpa;

    public Student(){
        name = "No name yet";
        gpa = 4.0;
    }

    public Student(String theName, double theGpa) {//This is a constructor
        name = theName;
        gpa = theGpa;
    }
    public String getName() {//Get is always a return type method
        return name;
    }

    public void setName() {//The set method is always a void method

    }

}
