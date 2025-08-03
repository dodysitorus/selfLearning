package Abstraction;

public class ChildEmirates extends ParentAirCraft{
    public static void main(String[] args) {
        ChildEmirates ce = new ChildEmirates();
        ce.engine();
        ce.safetyGuidelines();
        ce.bodyColour();
    }

    @Override
    public void bodyColour() {
        System.out.println("Red color on the body");
    }
}