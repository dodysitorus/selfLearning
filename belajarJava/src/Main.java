//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    Methods
    public void getData(){
        System.out.println("I'm in method");
    }

//    Block
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//        Object
        Main main = new Main();
        SecondClass secondClass = new SecondClass();

        secondClass.setData();
        main.getData();
    }
}