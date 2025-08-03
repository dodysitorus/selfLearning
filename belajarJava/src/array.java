public class array {
    public static void main(String[] args) {

        int a[] = new int[5];
        a[0] = 2;
        a[1] = 12;
        a[2] = 10;
        a[3] = 9;
        a[4] = 7;

        int b[] = {1,2,3,4,5};

        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
