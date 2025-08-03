package SuperKeyword;

public class ThisDemo {
    int a = 2;

    /* kegunaan keyword "this" adalah mengambil variabel dalam level class berbeda dengan "super" yang mengambil
    di level parent class
     */
    public void getData(){
        int a = 3;
        System.out.println(a);
        System.out.println(this.a);
        int b = a + this.a;
        System.out.println(b);
    }
    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.getData();
    }
}
