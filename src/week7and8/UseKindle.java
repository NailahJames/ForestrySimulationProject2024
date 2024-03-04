package week7and8;

import java.util.Scanner;
//=================================================================================================
public class UseKindle {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int numberOfPages;

//----Get person information
        System.out.print("How many pages in the book : ");
        numberOfPages = keyboard.nextInt();

//----Create object
        Kindle aBook = new Kindle(numberOfPages);
        System.out.print("Initially                  : " + aBook);


//----Do some reading
        aBook.turnPages();//Setter methods
        aBook.turnPages();
        aBook.turnPages();
        aBook.turnPages();
        System.out.println("A bit later                : " + aBook);


//----Skip ahead
        aBook.turnPages(27);
        System.out.println("After skipping 27 pages    : " + aBook);


//----Try skip past the end of the book
        aBook.turnPages(8);//setter method that turns 8 pages
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
