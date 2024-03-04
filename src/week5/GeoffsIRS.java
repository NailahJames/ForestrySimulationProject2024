package week5;

import java.util.Scanner;
//==================================================================================
public class GeoffsIRS {
//==================================================================================
    private static final Scanner keyboard = new Scanner(System.in);

    private static final double STINKING_RICH = 500000;
    private static final double QUITE_RICH = 200000;
    private static final double MIAMI_POOR = 100000;
    private static final double AVERAGE = 50000;
    private static final double REALISTIC = 20000;

    public static void main(String[] args) {
        System.out.println("Enter 0 to stop the prompt.");
        double income = 0.0;
        double deduction = 0.0;
        double taxable = 0.0;
        double taxesOwed = 0.0;
        char taxGroup;

        while (true) {
            System.out.print("Enter next amount : ");
            double royalSubjectInput = keyboard.nextDouble();

            if (royalSubjectInput == 0.0) {
                break;
            }
            if (royalSubjectInput > 0.0) {
                income += royalSubjectInput;
            }
            else if (royalSubjectInput < 0.0) {
                deduction += Math.abs(royalSubjectInput);
            }
        }
        taxable = ComputeTaxableIncome(income, deduction);
        taxGroup = ComputeTaxGroup (taxable);
        taxesOwed = ComputeTaxesOwed (taxable, taxGroup);

        System.out.println("Income         =  " + "$" + income);
        System.out.println("Deductions     =  " + "$" + deduction);
        System.out.println("Taxable Income =  " + "$" + taxable);
        System.out.println("Tax Group      =  " + taxGroup);
        System.out.println("Tax Owed       =  " + "$" + taxesOwed);
    }// end of main method
//==================================================================================
    //Start of ComputeTaxableIncome. Computes the taxable
    private static double ComputeTaxableIncome(double income, double deduction) {
        double taxableIncome = 0.0;

        if (income >= deduction) {
            taxableIncome = income - deduction;
        }
        else {
            taxableIncome = 0.0;
        }

        return taxableIncome;
    }
//==================================================================================
    //----Start of ComputeTaxGroup method
    private static char ComputeTaxGroup(double taxableIncome) {
        char taxGroup;
        if (taxableIncome >= STINKING_RICH) {
            taxGroup = 'S';
        }
        else if (taxableIncome >= QUITE_RICH) {
            taxGroup = 'Q';
        }
        else if (taxableIncome >= MIAMI_POOR) {
            taxGroup = 'M';
        }
        else if (taxableIncome >= AVERAGE) {
            taxGroup = 'A';
        }
        else if (taxableIncome >= REALISTIC) {
            taxGroup = 'R';
        }
        else {
            taxGroup = 'P';
        }// end of
      return taxGroup;
    }// end of ComputeTaxGroup method
//==================================================================================
    //----Start of ComputeTaxesOwed method. computes the taxes owed of Royal Subject
    private static double ComputeTaxesOwed (double taxableIncome, char taxGroup) {
        double taxesOwed = 0.0;
// if else statement for the taxGroup
        if (taxGroup == 'S' || taxGroup == 'Q') {
            taxesOwed = taxableIncome * 0.25;
        }
        else if (taxGroup == 'M') {
            taxesOwed = taxableIncome * 0.10;
        }
        else if (taxGroup == 'A' || taxGroup == 'R') {
            taxesOwed = taxableIncome * 0.03;
        }
        else if (taxGroup == 'P') {
            taxesOwed = taxableIncome * 0.0;
        }
        else {
            System.out.print("Error!");
        } // end of taxesOwed if else statement
        return taxesOwed;
    } //end of ComputeTaxesOwed method

//==================================================================================
} // end of class GeoffsIRS
//==================================================================================


/* Design Process
1. Input income and deduction
   1.1 Repeatedly until 0.0 is entered
       1.1.1 Prompt user
       1.1.2 Input value
       1.1.3 If positive
           1.1.3.1 Add to income
       1.1.4 If negative
           1.1.4.1 Add (absolute) to deduction
2. Compute taxable income
   2.1 If income >= deduction then taxable is income - deduction, else
   2.2 Taxable is 0.0
3. Compute tax group
   3.1 If taxable >= 500000
       3.1.1 Group is S, else
   3.2 If taxable >= 200000
       3.2.1 Group is Q, else
   3.3 If taxable >= 100000
       3.3.1 Group is M, else
   3.4 If taxable >= 50000
       3.4.1 Group is A, else
   3.5 If taxable >= 20000
       3.5.1 Group is R, else
   3.6 Group is P
4. Compute tax
   4.1 Depending on the group
       4.1.1 For S and Q
           4.1.1.1 Tax is 25% of taxable
       4.1.2 For M
           4.1.2.1 Tax is 10% of taxable
       4.1.3 For A and R
           4.1.3.1 Tax is 3% of taxable
       4.1.4 For P
           4.1.4.1 Tax is 0.0
       4.1.5 For other groups
           4.1.5.1 Error!
5. Display tax information
   5.1 Display income
   5.2 Display deduction
   5.3 Display taxable
   5.4 Display group
   5.5 Display tax
 */