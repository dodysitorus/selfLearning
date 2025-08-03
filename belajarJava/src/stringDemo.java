public class stringDemo {
    public static void main(String[] args) {
//        String literal - Immutable
        String a = "hello";
        String b = "hello";
        a.concat("World");
        System.out.println(a);
        String s = new String("hello");
        String s1 = new String("hello");

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a.equals(s));
        System.out.println(a==s);

//        StringBuffer and StringBuilder - Mutable
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" world");
        System.out.println(sb);
        sb.insert(2, "She");
        System.out.println(sb);
        sb.replace(5,7,"aa");
        System.out.println(sb);
        sb.deleteCharAt(12);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

//        StringBuilder is not thread safe. It is non synchronized, it is faster

    }
}
