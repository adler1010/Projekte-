// ahmed abdelgadir, ahmed shaalan

public class RecursiveFunction2 {


    public static int marge(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n - homer(marge(n - 1));
        }
    }

    public static int homer(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n - marge(homer(n - 1));
        }
    }

    public static boolean dispute(int n) {
        return marge(n) != homer(n);
    }

    public static int[] differenceDisputes(int x) {
    int[] differences = new int[x];
    int previousDisputeYear = -1;
    int count = 0;

    for (int year = 0; count < x; year++) {
        if (dispute(year)) {
            if (previousDisputeYear != -1) {
                differences[count] = year - previousDisputeYear;
                count++;
            }
            previousDisputeYear = year;
        }
    }

    return differences;
    }

    public static void main(String[] args) {
   
    System.out.println("Streit an der kupfernen Hochzeit: " + dispute(7));
    System.out.println("Streit an der silbernen Hochzeit: " + dispute(25));

    
    int[] differences = differenceDisputes(10);  
    for (int i = 0; i < differences.length; i++) {
        System.out.println("Differenz " + (i + 1) + ": " + differences[i]);
    }

   
  }

  }