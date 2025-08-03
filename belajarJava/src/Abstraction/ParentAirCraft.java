package Abstraction;

public abstract class ParentAirCraft {
    public void engine(){
        System.out.println("Follow Engine Guideline");
    }

    public void safetyGuidelines(){
        System.out.println("Follow Safety Guideline");
    }

    public abstract void bodyColour();
}
