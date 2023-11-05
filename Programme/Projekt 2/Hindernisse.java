/**
* Programm, das Zahlen von 1 bis 100 ausgibt und bei jeder 
* durch 3 teilbaren Zahl 4 Schritte bzw. bei jeder durch 4 teilbaren Zahl 3 Schritte macht .
*
*/

public class Hindernisse  {
    public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {	
		
			if  (i % 3 == 0 && i % 4 == 0 ) {
			
				System.out.print( i + "\n" );
		
				i = i + 7;
			} else if (i % 3 == 0) {
				System.out.print( i + "\n" );
		
				i = i + 4;
			} else if (i % 4 == 0) {
				System.out.print( i + "\n");
		
				i = i + 3; 
			}
			
			if (i >= 100) {   //damit die 103 nicht ausgegeben wird, rufen wir diese if -Abfrage auf.
				break; 
			}
		
			System.out.print( i + "\n" );
		
		}
        
    }
}
