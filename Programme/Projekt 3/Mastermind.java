import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
*@return
*
*/
public class Mastermind {
	public static void main(String[] args) {
		
		readChars(); }
/**
*
*@return res gibt die Zahlen zurück.
*@param comgerzahlen lässt den Computer zufällige zahlen raten.
*/

	public static String comgerzahlen(String comgerzahlen) {
		Random random = new Random();
		int[] a = new int[4];
			i[0"7"][1"6"][2"5"][]
			q[0"7"][1"6"][][]
		int i = 0;
		do {
				
			a[i] = 1 + random.nextInt(8);
			for (int q = 0; q < i; q++) {
				
				if (a[i] == a[q]) { 
					i--;
				}
			}
				
			i++;	    
				
		}
		while (i < a.length);
			
		String res = Arrays.toString(a);
		return res;
	}
		
/**
*@return
*@param comgerzahlen.
*/
	public static void readChars() {
		
		String f = comgerzahlen("a");
		
		System.out.println(f);
		
		System.out.println("Raten Sie die Zahlen | VNr. = 1");
		
		Scanner input = new Scanner(System.in);
		String eingabe = input.next();
		
		//1 4 7 10 
			
		
		for (int h = 2; h <= 11; h++) {
			int nrp = 0;
			int rp = 0;
			
		    if (f.charAt(1) == eingabe.charAt(0)) {
				rp = rp + 1;
			} else if (eingabe.charAt(0) == f.charAt(1)) {
				
				nrp = nrp + 1; 
			} else if (eingabe.charAt(0) == f.charAt(4)) {
				nrp = nrp + 1; 
			} else if (eingabe.charAt(0) == f.charAt(7)) {
				nrp = nrp + 1;
			} else if (eingabe.charAt(0) == f.charAt(10)) {
				nrp = nrp + 1;
			}
			
			
		    if (f.charAt(4) == eingabe.charAt(1)) {
				rp = rp + 1;
			} else if (eingabe.charAt(1) == f.charAt(1)) {
				nrp = nrp + 1; 
			} else if (eingabe.charAt(1) == f.charAt(4)) {
				nrp = nrp + 1; 
			} else if (eingabe.charAt(1) == f.charAt(7)) {
				
				nrp = nrp + 1; 
			} else if (eingabe.charAt(1) == f.charAt(10)) {
				nrp = nrp + 1;
			}
			
			
		    if (f.charAt(7) == eingabe.charAt(2)) {
				rp = rp + 1; 
			} else if (eingabe.charAt(2) == f.charAt(1)) {
				nrp = nrp + 1; 
			} else if (eingabe.charAt(2) == f.charAt(4)) {
				nrp = nrp + 1; 
			} else if (eingabe.charAt(2) == f.charAt(7)) {
				nrp = nrp + 1; 
			} else if (eingabe.charAt(2) == f.charAt(10)) {
				nrp = nrp + 1; 
			}
			
			
			if (f.charAt(10) == eingabe.charAt(3)) {
				rp = rp + 1; 
			} else if (eingabe.charAt(3) == f.charAt(1)) {
				nrp = nrp + 1; 
			} else if (eingabe.charAt(3) == f.charAt(4)) {
				nrp = nrp + 1; 
			} else if (eingabe.charAt(3) == f.charAt(7)) {
				nrp = nrp + 1; 		
			} else if (eingabe.charAt(3) == f.charAt(10)) {
				nrp = nrp + 1; 
				
				
			}
				
			if (rp == 4) {
				System.out.println("Sie haben die Zahlen richtig erraten (^-^)");
				System.out.println("Anzahl der Versuche : " + (h - 1) );
				break;
			}
			
			
			
		    if (h >= 1 && h <= 10) {
				System.out.println(nrp + " Zahlen sind nicht in der richtigen Position " + "\n" + rp + " Zhalen sind in der richtigen Position");
				System.out.println("Raten Sie noch einmal " + "| VNr. = " + h);
				eingabe = input.next();
				
			}
			
		    if (h == 11) {
			    System.out.println("Sie haben 10 Versuche geleistet"); 
				System.out.println("Leider hat das Programm gewonnen!"); 
				System.out.println("Die richtige Lösung ist : " + f);
				break;
			} 
		}
		
	}

}	
