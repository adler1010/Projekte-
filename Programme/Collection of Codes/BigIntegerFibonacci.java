/**************************************
Die Methode fib1(5) initiiert eine Baumrekursion, bei der fib1 mehrmals aufgerufen wird.
 Der Baum :

                     fib1(5)
                   /        \
              fib1(4)       fib1(3)
             /      \       /      \
        fib1(3)  fib1(2) fib1(2)  fib1(1)
       /    \    /    \   /    \
 fib1(2) fib1(1) fib1(1) fib1(0) fib1(1) fib1(0)
 /    \
fib1(1) fib1(0)

Jeder Knoten repräsentiert einen Aufruf von fib1. Die Blätter sind die Basisfälle (fib1(1) und fib1(0)).

(Ahmed Abdelgadir, Ahmed Shaalan)
***********************************************/
import java.math.BigInteger;

public class BigIntegerFibonacci {

    public static BigInteger fib1(int n){
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;
        return fib1(n - 1).add(fib1(n - 2));
    }

    public static BigInteger fib2(int n){
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c;

        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Die ersten 15 Fibonacci-Zahlen (rekursiv):");
        for (int i = 0; i < 15; i++) {
            System.out.println("fib1(" + i + ") = " + fib1(i));
        }

        System.out.println("Fibonacci Zahl für n = 23 (rekursiv): " + fib1(23));
        System.out.println("Fibonacci Zahl für n = 23 (iterativ): " + fib2(23));
    }
}
