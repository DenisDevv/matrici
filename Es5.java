public class Es5 {
    public static void main(String[] args) {
        int[][] matriceQuadrata = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[] risultato = sommaRighe(matriceQuadrata);
        
        for (int i = 0; i < risultato.length; i++) {
            System.out.println("La somma degli elementi della riga " + (i + 1) + " è: " + risultato[i]);
        }
    }
    
    public static int[] sommaRighe(int[][] matriceQuadrata) {
        int[] somme = new int[matriceQuadrata.length];
        
        for (int i = 0; i < matriceQuadrata.length; i++) {
            int somma = 0;
            
            for (int j = 0; j < matriceQuadrata[i].length; j++) {
                somma += matriceQuadrata[i][j];
            }
            
            somme[i] = somma;
        }
        
        return somme;
    }
}