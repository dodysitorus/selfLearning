public class multidimensionalArray {
    public static void main(String[] args) {

//        a[row][column]
        int a[][] = new int[3][3];
        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 7;
        a[2][0] = 1;
        a[2][1] = 2;
        a[2][2] = 9;

//        System.out.println(a[0][1]);

        int b[][] = {{2, 4, 5}, {4, 0, 2}, {5, 7, 9}};

        int temp = b[0][0];
//        int temp = Integer.MAX_VALUE;
        int minCoulumn = 0;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] < temp) {
                    temp = b[i][j];
                    minCoulumn = j;
                }
                System.out.print(b[i][j]);
            }
            System.out.println("");
        }
        System.out.println("hasil dari temp " + temp);

        int k = 0;
        while (k < 3) {
            if (b[k][minCoulumn] > max) {
                max = b[k][minCoulumn];
            }
            k++;
        }
        System.out.println("hasil dari max " + max);
    }
}
