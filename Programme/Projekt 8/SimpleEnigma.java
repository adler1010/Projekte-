import java.util.Random;
/**
*Diese Klasse erzeugt Objekte von Letterwheels und deren Konfiguration.
*Sie prüft, ob die gegebenen Buchstaben RING ergeben und wenn nicht dann wird die konfigurationgeändert.
*Sie gibt die Hinweise aus.
*
*/
public class SimpleEnigma {
    
    /**
    *aw steht für Anzahl der Räder und davon 1 abgezogen.
    */
    private int aw;
	
    private Random random = new Random();
    /**
    *
    *anzalRaeder speichert die Anzahl von Räder.
    */
    private static int anzalRaeder;
    private Letterwheel xcvb  = new Letterwheel();
    /**
    *
    *t ist ein Array, das Objekte speichert.
    */
    private static Letterwheel[] t = new Letterwheel[GameMaster.getO()];
    /**
    *Diese Funktion gibt t zürück..
    *@param a bekommt position int t übergeben.
    * @return gibt das gewünschte Object.
    */
    public static Letterwheel getT(int a) {
        
        return t[a];
    }
    /**
    *
    *anzahl steht als Zähler.
    */
    private static int anzahl = t.length - 1;
   
	
    /**
    *Diese Konstruktur bekommt die Anzahl der Letterwheels übergeben und speichert ihn,
    *führt die Konfiguration aus und prüft, ob die Letterwheels in verschiedenen Konfigurationen stehen. 
    *wenn nicht, dann wird die Konfiguration geändert bis die Letterwheels nicht mehr gleich sind.
    *@param anzahlLetterwheels ist die Anzahl von Letterwheels.
    */
	
    public SimpleEnigma(int anzahlLetterwheels) {
        
        this.anzalRaeder = anzahlLetterwheels;
       
        for (int i = 0; i < anzahlLetterwheels; i++) {
            t[i] = new Letterwheel();
            int konfiguration = 1 + random.nextInt(25);
            for (int j = 0; j < konfiguration; j++) {
				t[i].rotate(); 
            }
        }
        
        int x = 0;
        do {
            for (int y = 0; y < x; y++) {
				
                if (t[x].equals(t[y]) == true ) { 
                        
                    t[y] = new Letterwheel();
                    int konfiguration = 1 + random.nextInt(25);
                    for (int j = 0; j < konfiguration; j++) {
                        t[y].rotate(); 
                    }
                        
                }
            }
				
            x++;	    
				
        } while (x < t.length);
    }
    
    /**
    *Diese Funktion bekommt die vom Nutzer eigegebenen Zahlen übergeben und ruft für
    *jeden Buchstabe die Funktion process auf. 
    *
    *@param as ist das Array mit den vom Nutzer angegeben Buchstaben.
    *@return Nachdem alle Buchstaben bearbeitet wurden und RING nicht ergeben gibt sie true zurück. 
    */
    public boolean receive(char[] as) {
       
      
        if (xcvb.process(as[0]) == 'R' && xcvb.process(as[1]) == 'I' && xcvb.process(as[2]) == 'N' && xcvb.process(as[3]) == 'G' ) {
                
            return false; 
        } else {
            return true;
        }
    }
	
    /**
    *Diese Funktion rutiert das letzte Rad bei jedem Aufruf zufällig.
    *Und das Rad davor bei dem zweiten und so weiter .
    *Wenn anzahl <0 ist dann wird anzahl auf anzalRaeder-1 gesetzt.
    *
    */
    
    public void turnWheels() {
        if (anzahl < 0) {
            anzahl = anzalRaeder - 1;
        }
		
        this.aw = anzahl;
        t[this.aw] = new Letterwheel();
        int konfiguration = 1 + random.nextInt(25);
        for (int j = 0; j < konfiguration; j++) {
            t[this.aw].rotate(); 
        }
        t[GameMaster.getO() - 1] = new Letterwheel();
        konfiguration = 1 + random.nextInt(25);
        for (int j = 0; j < konfiguration; j++) {
            t[GameMaster.getO() - 1].rotate(); 
        }
        this.aw = anzahl--; 
    }
    
    /**
    *
    *Diese Funktion gibt die Räder beim Aufruf aus.
    *@return a gibt das Index 0 des Arrays zurück.
    *
    */
    public String[] hint() {
        
        String[] a = new String[1];
        a[0] = xcvb.toString();
        return a;
        
    }
    
    /**
    *
    *Diese Funktion gibt das spezifizierte Rad aus.
    *@param sRad steht für das spezifizierte Rad.
    *@return nStr gibt das spezifizierte Rad aus.
    */
    public String hint(int sRad) {
		
        String nStr = new String(t[sRad].getAZ());
        System.out.println(nStr);
        return nStr;
        
    }
    
  
}

