public class Factorization {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Bitte geben Sie eine Zahl ein.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        System.out.print(n + " = ");
        primeFactorization(n);
    }

    public static void primeFactorization(int n) {
        boolean first = true;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                if (!first) {
                    System.out.print(" * ");
                }
                System.out.print(i);
                if (count > 1) {
                    System.out.print("^" + count);
                }
                first = false;
            }
        }
        System.out.println();
    }
}
