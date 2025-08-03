public class a {
    public static void main(String[] args) {
        translateStatus(5);
    }

    public static void translateStatus(int status) {
        if (status == 0) {
            System.out.println("PENDING");
        } else if (status == 1) {
            System.out.println("PAID");
        } else if (status == 2) {
            System.out.println("FAILED");
        } else if (status == 3) {
            System.out.println("CANCELLED");
        } else {
            System.out.println("UNKNOWN_STATUS");
        }
    }
}
