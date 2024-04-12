public class Es7 {
    public static void riempiMatrice(int[][] matrice) {
        int n = matrice.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    matrice[i][j] = 1;
                } else {
                    matrice[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrice = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        
        riempiMatrice(matrice);
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
