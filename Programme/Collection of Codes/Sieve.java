public class Sieve {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];
        
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        for (int factor = 2; factor*factor <= n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor*factor; j <= n; j += factor) {
                    isPrime[j] = false;
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
