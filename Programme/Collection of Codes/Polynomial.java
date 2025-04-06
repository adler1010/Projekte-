//ahmed abdelgadir, ahmed shaalan

public class Polynomial {
    private int degree; // höchster Grad von x
    private double[] coeffs; // Array mit Koeffizienten, alle Koeffizienten [0..degree] sind notwendig
    
  
    public Polynomial(double[] c) {
        degree = c.length - 1;
        coeffs = new double[c.length];
        System.arraycopy(c, 0, coeffs, 0, c.length);
    }
    
   
    public int getDegree() {
    for (int i = coeffs.length - 1; i >= 0; i--) {
        if (coeffs[i] != 0) {
            return i;
        }
    }
    return 0;
}

    
    
    public double[] getAllCoefficients() {   
        return coeffs.clone();
    }
        
  
    public double getCoefficient(int i) {
        if (i < 0 || i > degree) {
            return 0;
        }
        return coeffs[i];
    }
    
   
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = degree; i >= 0; i--) {
            if (coeffs[i] == 0) continue;
            if (sb.length() > 0 && coeffs[i] > 0) sb.append("+");
            if (i == 0 || coeffs[i] != 1) sb.append(coeffs[i]);
            if (i >= 1) sb.append("x");
            if (i > 1) sb.append("^").append(i);
        }
        return sb.toString();
    }
    
  
    public double evaluate(double x) {
        double result = 0;
        for (int i = degree; i >= 0; i--) {
            result = coeffs[i] + (x * result);
        }
        return result;
    }
    
    
    public Polynomial differentiate() {
        if (degree == 0) {
            return new Polynomial(new double[]{0});
        }
        double[] derivCoeffs = new double[degree];
        for (int i = 0; i < degree; i++) {
            derivCoeffs[i] = coeffs[i + 1] * (i + 1);
        }
        return new Polynomial(derivCoeffs);
    }
    
    public static void main(String[] args) {
        Polynomial p = new Polynomial(new double[] {1, 0, 3}); // 1 + 3x^2
        System.out.println("Polynomial: " + p);
        System.out.println("Degree: " + p.getDegree());
        System.out.println("Coefficient of x^2: " + p.getCoefficient(2));
        System.out.println("Value at x=2: " + p.evaluate(2));
        Polynomial derivative = p.differentiate();
        System.out.println("Derivative: " + derivative);
    }
}
