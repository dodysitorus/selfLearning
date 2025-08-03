public class test {
    public static void main(String[] args) {
        int a = 12321;
        int num = a;
        int temp;
        int result = 0;

        while (a > 0) {
            temp = a % 10;
            result = (result * 10) + temp;
            a = a / 10;
        }
        if (num == result) {
            System.out.println(num + " is palindrome");
        } else
            System.out.println(num + " tidak palindrome");

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
