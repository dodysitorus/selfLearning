public class constructDemo {
//    default constructor
    public constructDemo(){
        System.out.println("I'm in the constructor");
    }
//parameter constructor
    public constructDemo(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public constructDemo(String str){
        System.out.println(str);
    }
    public void getData(){
        System.out.println("I'm in the method");
    }

    /* penamaan constructor harus sama dengan nama class dan jika kita membuat constructor dan berhasil
membuat sebuah objek dari class maka apa yg ada di constructor akan dijalankan secara otomatis */

    /* ada dua jenis constructor yaitu default constructor dan parameter constructor, jika pemanggilan objek dilakukan
    dengan inputan parameter sesuai dengan constructor, maka akan memanggil constructor tersebut */

    public static void main(String[] args) {
        constructDemo c = new constructDemo();
        constructDemo d = new constructDemo(4,5);
        constructDemo e = new constructDemo("hello");
    }
}
