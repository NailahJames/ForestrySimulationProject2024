package week9;

public class FluidParticles {
//===============================================================================================
//-----------------------------------------------------------------------------------------------

//----Data items for the particles
private int particleTag;
private double xPosition;
private double yPosition;

//----Constructor for the identification tag
    public FluidParticles (int particleTag) {
        this.particleTag = particleTag;
        this.xPosition = 0.0;
        this.yPosition = 0.0;
    }
//----toString method to display the positions
    @Override
    public String toString() {
        return "Particle " + particleTag + " is at (" + xPosition + ", " + yPosition + ")";
    }

//----translate method for translating the direction of the particle
    public void translateParticleDirection (double xDirection, double yDirection) {
        this.xPosition += xDirection;
        this.yPosition += yDirection;
    }
//----------------------------------------------------------------------------------------------
}//end of FluidParticles class
//==============================================================================================