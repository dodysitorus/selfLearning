package javaCollections;

import SuperKeyword.ParentClass;

/*
Perbedaan hashmap dgn hashtable adalah, jika hashmap synchronize dan not thread safe, sedangkan hashtable thread safe
synchroze

hashmap dapat null key dan null valu sedangkan hashtable tidak dapat menerima null key dan null value

hashmap diiterasikan menggunakan iterator. Hashtable hanya dapat hanya class selain cektor yg menggunakan enumerator
untuk mengiterasikan value di hashtable
 */

import SuperKeyword.ParentClass;

import java.util.ArrayList;

public class collectionDemo {


    public static void main(String[] args) {
        int a[] = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        // Print unique number from the list - Amazon

        //output
        // 4-3; 5-3; 6-2; 9-1

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int k = 0;
            if (!al.contains(a[i])) {
                al.add(a[i]);
                k++;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        k++;
                    }
                }
                System.out.println(a[i] + " " + k);
                if (k == 1) {
                    System.out.println(a[i] + " is unique number");
                }
            }
        }



    /*
    Class A dapat menggunakan Class B secara langsung menggunakan objek jika adalam package yg sama
     */
        arrayList a1 = new arrayList();
        a1.abc();

        /*
    Class A dapat menggunakan Class B harus melakukan import package jika di dalam package yg berbeda
     */
        ParentClass pc = new ParentClass();
        pc.getData();
    }

       /*
        public, private, protected, default
         */

    // Default : access method anywhere only in package
    void abc(){
    }

    // Public : variable/method as public : then ypu will access across all
    // Private : you cannot access method or variable outside the class of same package as well
    // Protected : variable/method as protected : you can access those in subclass only (other packages)

}
