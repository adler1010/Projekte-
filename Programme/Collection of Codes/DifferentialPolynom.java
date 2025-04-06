// Ahmed Abdelgadir, Ahmed Shaalan 

public class DifferentialPolynom {
    public static double[] diffPoly(double[] coeffs) {

        if (coeffs.length <= 1) {
            return new double[] {}; // Leeres Array für konstante Funktion
        }

     
        double[] diffCoeffs = new double[coeffs.length - 1];

        for (int i = 1; i < coeffs.length; i++) {
            diffCoeffs[i - 1] = coeffs[i] * i;
        }

        return diffCoeffs;
    }

    public static void main(String[] args) {
      
        double[] poly = {7, 5, 3}; // Polynom 7 + 5x + 3x^2
        double[] diffPoly = diffPoly(poly);

        System.out.print("Differenziertes Polynom: [");
        for (int i = 0; i < diffPoly.length; i++) {
            System.out.print(diffPoly[i]);
            if (i < diffPoly.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
