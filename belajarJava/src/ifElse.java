public class ifElse {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 9) {
//                System.out.println(i);
//                break;
//            } else {
//                System.out.println(i + " 9 is not displayed");
//            }
//        }

        for (int i=1; i<=4; i++){  //This block will loop 4 times (outer loop)
            System.out.println("outer loop started");
            for (int j = 1; j <=4 ; j++) { //inner loop
                System.out.println("inner loop");
            }
            System.out.println("outer loop finished");
        }
    }
}