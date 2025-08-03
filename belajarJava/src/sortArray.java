import java.util.ArrayList;

public class sortArray {
    public static void main(String[] args) {
//        int a = 4;
//        int b = 5;
//        int temp;

//        swap using temp variable
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a);
//        System.out.println(b);

//        swap without temp variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println(a);
//        System.out.println(b);

        int a[] = {2, 6, 1, 4, 9};

/*algoritma buble sort, pertama lakukan outer looping untuk mendapatkan setiap elemen di array,
                kemudian lakukan perbandingan untuk elemen dari outer looping di bagian inner looping
        jika outer looping lbh besar dibanding inner looping. lakukan swap*/

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

