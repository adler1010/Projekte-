import java.util.Random;

public class Percolation {

    // Erstellt eine y x x Matrix und blockiert einige Felder basierend auf der Wahrscheinlichkeit p
    private static boolean[][] createMatrix(int y, int x, double p) {
        boolean[][] matrix = new boolean[y][x];
        Random rand = new Random();

        // Durchlaufen aller Felder in der Matrix
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                // Blockiere das Feld basierend auf der Wahrscheinlichkeit p
                matrix[i][j] = rand.nextDouble() >= p; // true für offen (nicht blockiert), false für blockiert
            }
        }
        return matrix;
    }

    // Überprüft, ob es in der gegebenen Matrix einen Perkolationspfad gibt
    private static boolean hasPercolationPath(boolean[][] matrix) {
        int y = matrix.length;
        int x = matrix[0].length;
        boolean[][] visited = new boolean[y][x];

        // Überprüfe, ob es von jedem Feld in der obersten Zeile einen Pfad gibt
        for (int j = 0; j < x; j++) {
            if (findPath(matrix, visited, 0, j)) {
                return true;
            }
        }
        return false;
    }

    // Rekursive Methode zur Pfadsuche in der Matrix
    private static boolean findPath(boolean[][] matrix, boolean[][] visited, int i, int j) {
        int y = matrix.length;
        int x = matrix[0].length;

        // Überprüfen, ob das aktuelle Feld außerhalb der Matrixgrenzen liegt oder blockiert ist
        if (i < 0 || i >= y || j < 0 || j >= x || visited[i][j] || !matrix[i][j]) {
            return false;
        }

        visited[i][j] = true; // Markiere das Feld als besucht

        // Prüfen, ob die unterste Zeile erreicht wurde
        if (i == y - 1) {
            return true;
        }

        // Versuche, in alle vier Richtungen zu gehen
        return findPath(matrix, visited, i + 1, j) || 
               findPath(matrix, visited, i - 1, j) || 
               findPath(matrix, visited, i, j + 1) || 
               findPath(matrix, visited, i, j - 1);
    }

    public static void main(String[] args) {
        // Überprüfen, ob die korrekte Anzahl von Argumenten übergeben wurde
        if (args.length != 4) {
            System.out.println("Bitte geben Sie genau vier Argumente ein: y x p n");
            return;
        }

        try {
            // Umwandeln der Eingabeparameter in die entsprechenden Datentypen
            int y = Integer.parseInt(args[0]);
            int x = Integer.parseInt(args[1]);
            double p = Double.parseDouble(args[2]);
            int n = Integer.parseInt(args[3]);

            int percolatingCount = 0; // Zähler für die Anzahl der perkolierenden Matrizen

            // Erstellen und Überprüfen von n Matrizen
            for (int i = 0; i < n; i++) {
                boolean[][] matrix = createMatrix(y, x, p);
                if (hasPercolationPath(matrix)) {
                    percolatingCount++;
                }
            }

            // Ausgeben der Ergebnisse
            System.out.println("Perkolierende Matrizen: " + percolatingCount + "/" + n + " (" + ((double) percolatingCount / n * 100) + "%)");
        } catch (NumberFormatException e) {
            System.out.println("Bitte geben Sie gültige numerische Werte für y, x, p und n ein.");
        }
    }
}
