public class Es4 {
    public static void main(String[] args) {
        int[][] maQuadrata = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        trasportaMaQuadrata(maQuadrata);
        for (int i = 0; i < maQuadrata.length; i++) {
            for (int j = 0; j < maQuadrata[0].length; j++) {
                System.out.print(maQuadrata[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void trasportaMaQuadrata(int[][] maQuadrata) {
        int n = maQuadrata.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = maQuadrata[i][j];
                maQuadrata[i][j] = maQuadrata[j][i];
                maQuadrata[j][i] = temp;
            }
        }
    }
}
