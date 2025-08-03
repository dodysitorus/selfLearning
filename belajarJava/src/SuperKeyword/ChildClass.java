package SuperKeyword;

public class ChildClass extends ParentClass{

   /* Di dalam inheritance jika pada parent class terdapat sebuah variabel dan di child class ada variabel dengan
        nama yang sama. Maka yg akan diprint adalah yg ada di child atau di lokal jika kita ingin memprint
            variabel yg ada di parent maka kita hrus menggunakan keyowrd "super" */

    /* Sama halnya dengan class yg di inheritance, jika ada class yg penamaannya di child dan parent sama
    maka class yg di parent akan di override oleh class yg di child. Jika kita ingin memanggil class yg di parent
    di child maka kita perlu menggunakan keyword "super"
     */

    /* Sama halnya dengan constructor, jika kita ingin menggunakan constructor dari parent di child cukup
    menggunakan keyword "super" pada line pertama constructor di child
     */

    public ChildClass(){
        super();
        System.out.println("I'm in the constructor child");
    }

    String name = "Dody";

    public void getData() {
        System.out.println(name);
        System.out.println(super.name);
        System.out.println("I'm in the child class");
        super.getData();
    }

    public static void main(String[] args) {
        ChildClass cd = new ChildClass();
        cd.getData();
    }
}
