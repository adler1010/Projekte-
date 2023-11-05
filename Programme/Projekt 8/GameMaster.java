import java.util.Scanner;

/**
*Dise Klasse bekommt die Anzahl der Räder als Kommandozeilenargument in main , konstruiert die Maschine mit dieser Anzahl und führt runtime aus.
*o ist Anzahl von Rädern.
*
*/

public class GameMaster {
    /**
    *Dieses Variable speichert die Anzahl von Rädern von 1-5.
    *
´   */
    private static int o;
    
    /**
    *Diese getMethode gibt o zurück.
    *@return gibt a zurück. 
    */
    public static int getO() {
        return o;
    }
    /**
    *Diese Funktion behandelt die Nutzereingaben.
    *Der Nutzer kann entweder hint für eine Ausgabe der Konfiguration aller Räder, hint
    *<nummer> für eine Ausgabe des Hinweises von einem Rad oder vier Großbuchstaben eingeben.
    *Das empfangene String wird in char Array umgewandelt und dann das Array mit der Buchstaben in receive Übergeben.
    *Wenn die 4 Buchstaben RING nicht ergeben wird die Konfiguration der letzen Rad geänder.
    *When die 4 Buchstaben vom zweiten Mal RING nicht ergeben, wird die Konfiguratin der letzen Rad und der Rad davor geändert.	
    *Wenn die Buchstaben RING ergeben wird die schleife beendet.
    */
    
    public static void runtime() {
        
        Scanner sc = new Scanner(System.in);
        SimpleEnigma asdf = new SimpleEnigma(o);
        Letterwheel asd = new Letterwheel(o);
        asd.toString();
        
        char[] q = new char[4];
        
        
        
        
        while (asdf.receive(q)) {
            System.out.println("Geben Sie (hint) , (hint<zahl>) oder 4 große Buchstaben !");
        
            String input = sc.nextLine();
            
            if ("hint".equals(input)) {
                asdf.hint();
            } else if ("hint1".equals(input)) {
                System.out.print("Rad 1: ");
                asdf.hint(0);
            } else if ("hint2".equals(input)) {
                System.out.print("Rad 2: ");
                asdf.hint(1);
            } else if ("hint3".equals(input)) {
                System.out.print("Rad 3: ");
                asdf.hint(2);
            } else if ("hint4".equals(input)) {
                System.out.print("Rad 4: ");
                asdf.hint(3);
            } else if ("hint5".equals(input)) {
                System.out.print("Rad 5: ");
                asdf.hint(4);
            } else {
                q[0] = input.charAt(0);
                q[1] = input.charAt(1);
                q[2] = input.charAt(2);
                q[3] = input.charAt(3);
        
				if (asdf.receive(q) == true) {
					asdf.turnWheels();
					System.out.println("Input ist falsch ! Bitte erneut Versuchen");
					System.out.println("Konfiguration wurde geändert !");
                
				}	
            }
        }
		
        System.out.println("Input  : " + q[0] + q[1] + q[2] + q[3]);
        System.out.println("Output : RING");
        System.out.println("You have beaten the machine. You can now enter Mount Doom. ");
        System.out.println("In the flame the ring was forged, can also be destroyed.");
		System.out.println("Throw it in the flames to end the misery of middle-earth.");
    }
    /**
    *Diese Methode bekommt die Anzahl der Räder als Kommandozeilenargument.
    *konstruiert die Maschine mit dieser Anzahl.
    *und führt runtime aus.
    *@param args ist Anzahl der Räder.
    */
    
    public static void main(String[] args) {
        o = Integer.parseInt(args[0]);
		
		SimpleEnigma asdf = new SimpleEnigma(o);
        Letterwheel asd = new Letterwheel(o);
        
		runtime();
        
       
       
    }
    
}