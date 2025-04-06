/* Teil 2 : 
ackermann(1, 10) ergibt 1024
ackermann(2, 4) ergibt 65536
ackermann(3, 3) ergibt 65536
Teil 3 :
Ressourcenbegrenzung: Der physische Speicher und die Prozessorzeit sind begrenzt.
Die Ackermannfunktion wächst extrem schnell, und für relativ kleine Eingabewerte können die Ergebnisse bereits unpraktikabel groß sein.

StackOverflowError: Aufgrund der tiefen Rekursion, die in der Ackermannfunktion vorkommt, kann der Stapelspeicher (Stack) des Programms erschöpft werden,
was zu einem StackOverflowError führt.

Rechenzeit: Selbst wenn der Speicher ausreicht, kann die Berechnung extrem lange dauern, was die Praktikabilität weiter einschränkt.


(Ahmed Abdelgadir, Ahmed Shaalan)
*/
import java.math.BigInteger;

public class AckermannFunction {

    public static BigInteger ackermann(BigInteger x, BigInteger y) {
        if (y.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        } else if (x.equals(BigInteger.ZERO)) {
            return y.shiftLeft(1); 
        } else if (y.equals(BigInteger.ONE)) {
            return BigInteger.valueOf(2);
        } else {
            return ackermann(x.subtract(BigInteger.ONE), ackermann(x, y.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        System.out.println("ackermann(1, 10): " + ackermann(BigInteger.valueOf(1), BigInteger.valueOf(10)));
        System.out.println("ackermann(2, 4): " + ackermann(BigInteger.valueOf(2), BigInteger.valueOf(4)));
        System.out.println("ackermann(3, 3): " + ackermann(BigInteger.valueOf(3), BigInteger.valueOf(3)));
    }
}
