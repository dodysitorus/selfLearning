package javaCollections;


import java.util.ArrayList;

/*
List can accept duplicate values
 */
public class arrayList {

    public void abc(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("test");
        a.add("test");
        a.add("test1");
        a.add(0, "student");
        System.out.println(a.get(2));
        System.out.println(a.indexOf("test"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
//        Collections.sort(a);
       /* a.remove(1);
        a.remove("test1");*/

        System.out.println(a.contains("dody"));

        System.out.println(a);

        for (String name : a) {
            System.out.println(name);
        }
    }


}
