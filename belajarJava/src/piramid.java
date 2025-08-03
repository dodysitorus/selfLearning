public class piramid {
    public static void main(String[] args) {
        piramid piramid = new piramid();
        piramid.piramids();
        piramid.invertedPiramids();
    }

   /* Untuk setiap outer loop akan menjalankan inner loop terlebih dahulu,
    untuk dapat lanjut ke outer loop berikutnya. Di sini kita lihat bahwa
    outer loop ada sebanyak 4, kemudian inner loop akan menjalankan "4-i"
    dimana "i" adalah variabel outer loop */

    public void piramids() {
        int k = 1;
        for (int i = 0; i < 4; i++) { //outer loop
            for (int j = 1; j <= 4 - i; j++) { //inner loop
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }
    }

    public void invertedPiramids() {
        int k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }
    }

}
