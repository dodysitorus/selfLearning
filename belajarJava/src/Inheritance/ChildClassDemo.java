package Inheritance;

public class ChildClassDemo extends ParentClassDemo{

    public void Colour(){
        System.out.println(colour);
    }

   /* Untuk function overloading memiliki nama yang sama tetapi dgn jumlah parameter yg berbeda
    atau tipe data parameter yg berbeda */

    public void getData(int a){
        System.out.println(a);
    }

    public void getData(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public void getData(String a){
        System.out.println(a);
    }

   /* Untuk function overriding memiliki nama yg sama, parameter yg sama tetapi melakukan replace thdp
    function yg di parent dgn function yg ada di child */

    public void AudioSystems(){
        System.out.println("Audio Systems Child Class");
    }

    public static void main(String[] args) {
        ChildClassDemo cd = new ChildClassDemo();
        cd.Colour();
        cd.Engine();
        cd.getData(2);
        cd.getData(2,3);
        cd.getData("a");
        cd.AudioSystems();
    }
}
