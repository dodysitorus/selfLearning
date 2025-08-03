package exception;

public class exceptionDemo {

    int a = 4;
    int b = 7;
    int c = 0;

    /* one try can be followed by multiple catch block
    catch should be a immediate by try block
     */
    public void getData() {
        try {
            int k = b / c;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("I cacthed the arithmetic error/exception");
        } catch (Exception e) {
            System.out.println("I catched the error/exception");
        } finally {
            /* this block is executed urrespective of exception thrown or not */
            System.out.println("delete cookies");
        }
    }

    public static void main(String[] args) {
        exceptionDemo ex = new exceptionDemo();
        ex.getData();
    }
}