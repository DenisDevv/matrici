public class Es3 {
    public static void main(String[] args) {
        int[][] maQuadrata = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        if (isSimmetrica(maQuadrata)) {
            
        } else {
            
        }
    }
    public static boolean isSimmetrica(int[][] maQuadrata) {
        int n = maQuadrata.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (maQuadrata[i][j] != maQuadrata[j][i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}