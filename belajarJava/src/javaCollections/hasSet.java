package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class hasSet {
    public static void main(String[] args) {
        /*
        HashSet treeset, LinkedHasset implements Set Interface
        does not accept duplicate values
        there is no gurantee elements stored in sequential order.. Random order
         */
        HashSet<String> hs = new HashSet();
        hs.add("USA");
        hs.add("UK");
        hs.add("INDONESIA");
        hs.add("INDONESIA");
//        System.out.println(hs);
//        System.out.println(hs.remove("UK"));
//        System.out.println(hs.isEmpty());
//        System.out.println(hs.size());

        /* Iterator */
        Iterator<String> i = hs.iterator();
//        System.out.println(i.next());
//        System.out.println(i.next());

        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
