public class reverseDemo {
    public static void main(String[] args) {
        String s = "katak";
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }

        System.out.println(result);

        if (result.equals(s)){
            System.out.println(s+ " is palindrome");
        }else {
            System.out.println(s+ " is not palindrome");
        }
    }
}
