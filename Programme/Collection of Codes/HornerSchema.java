public class HornerSchema {
    //Ahmed Abdelgadir, Ahmed Shaalan//

    public static double evalSimple(double[] a, double x) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            double term = a[i];
            for (int j = 0; j < i; j++) {
                term *= x;
            }
            result += term;
        }
        return result;
    }

    public static double evalHorner(double[] a, double x) {
        double result = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            result = result * x + a[i];
        }
        return result;
    }

     public static double evalHornerRec(double[] a, double x) {
        return evalHornerRec(a, a.length, x, 0);
    }

    private static double evalHornerRec(double[] a, int n, double x, int i) {
        if (i < n) {
            return evalHornerRec(a, n, x, i + 1) * x + a[i];
        } else {
            return 0;
        }
    }


    public static void main(String args[]) {
        double[] coefficients = new double[]{3, -4, 5}; //  3 - 4x + 5x^2
        double x = 2;

        System.out.println("evalSimple Result: " + evalSimple(coefficients, x));
        System.out.println("evalHorner Result: " + evalHorner(coefficients, x));
        System.out.println("evalHornerRec Result: " + evalHornerRec(coefficients, x));
    }
}
