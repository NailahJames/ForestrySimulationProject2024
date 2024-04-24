package week9;
import java.util.Scanner;
public class UseFluidParticles {
//======================================================================================
private static Scanner keyboard = new Scanner(System.in);
//--------------------------------------------------------------------------------------
    public static void main(String[] args) {
    //----Variables
        int particleTag;
        double xDirection;
        double yDirection;

    //----Prompting the user to enter the particle tag
        System.out.print("Particle tag id?: ");
        particleTag = keyboard.nextInt();

    //----Creating a particle object
        FluidParticles particle = new FluidParticles(particleTag);

    //----Using the toString method, it outputs the inputted particle tag
        System.out.println(particle);

    //----do-while loop prompts user to enter the movement, stops when user enters 0.0 0.0

        while(true) {
            System.out.print("Enter movement: ");
            xDirection = keyboard.nextDouble();
            yDirection = keyboard.nextDouble();
            particle.translateParticleDirection(xDirection,yDirection);
            System.out.println(particle);
            if(xDirection == 0.0 && yDirection == 0.0) {
                break;
            }
        }
        }

}//end of the UseFluidParticles class

