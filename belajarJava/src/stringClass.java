public class stringClass {
    public static void main(String[] args) {

        String a = " javatraining";
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("a"));
        System.out.println(a.substring(3,6));
        System.out.println(a.substring(5));
        System.out.println(a.concat("dody"));
        System.out.println(a.trim());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        String arr[] = a.split("t");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("t","s"));
    }
}
