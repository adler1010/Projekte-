
/**
*Diese Klasse erzeugt Letterwheels,
*Wandelt Buchstaben um,
*Methode rotate() gestalltet,
*Zwei Objekte mit einander vergleicht 
*und die Konfiguration ausgibt.
*/
public class Letterwheel {
	
    /**
    *
    *Das speichert Anzahl der Räder.
    *
    */
    private int anzalRaeder;
    /**
    *az ist das Array nach der Konfiguration.
    *
    */
    private char[] aZ = 
	{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    /**
    *Diese Funktion gibt aZ zurück.
    *@return aZ gibt die bearbeitete Methode zurück.
    */
    public char[] getAZ() {
        
           
        return aZ;
    
        
    }
    /**
    *az1 ist das Array ohne die Konfiguration.
    *
    */
    
    private char[] aZ1 =
    {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    /**
    *Dieses Konstruktur bekommt die Anzahl der Räder übergebn und speichert sie in dem Variable.
    *@param anzahlreader ist die übergebene Anzahl der Räder.
    *
    */
    public Letterwheel(int anzahlreader) {
        this.anzalRaeder = anzahlreader;
    }
    /**
    *Dieses Konstruktur ist leer.
    *
    */
    Letterwheel() {
    }
    /**
    *@param letter ist das einzeln übergebene Character.
    *Diese Finktion behandelt Buchstaben einzeln und ist auf 5 Räder begrenzt.	
    *Sie Funktioniert so, dass die Ausgabe des vorherigen Rad als Eingabe  für das Nächste ist.
    *@return gibt den verarbeiteten Buchstabe zurück.
    */
    public char process(char letter) {
        char letterver = 0;
        char letterver1 = 0;
        char letterver2 = 0;
        char letterver3 = 0;
        char letterver4 = 0;
        
        if (GameMaster.getO() == 1) {
			
            for (int i = 0; i < 26; i = i + 1) {
            
                if (SimpleEnigma.getT(0).aZ[i] == letter) {
                    letterver = SimpleEnigma.getT(0).aZ1[i];
                }
            }
            return letterver;
        } else if (GameMaster.getO() == 2) {
			
            for (int i = 0; i < 26; i = i + 1) {
            
				if (SimpleEnigma.getT(0).aZ[i] == letter) {
                    letterver = SimpleEnigma.getT(0).aZ1[i];
				}
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(1).aZ[i] == letterver) {
                    letterver1 = SimpleEnigma.getT(1).aZ1[i];
                }
            }
            return letterver1;
        } else if (GameMaster.getO() == 3) {
			
            for (int i = 0; i < 26; i = i + 1) {
            
                if (SimpleEnigma.getT(0).aZ[i] == letter) {
                    letterver = SimpleEnigma.getT(0).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(1).aZ[i] == letterver) {
                    letterver1 = SimpleEnigma.getT(1).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(2).aZ[i] == letterver1) {
                    letterver2 = SimpleEnigma.getT(2).aZ1[i];
                }
            }
            return letterver2;
        } else if (GameMaster.getO() == 4) {
			
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(0).aZ[i] == letter) {
                    letterver = SimpleEnigma.getT(0).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(1).aZ[i] == letterver) {
                    letterver1 = SimpleEnigma.getT(1).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(2).aZ[i] == letterver1) {
                    letterver2 = SimpleEnigma.getT(2).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(3).aZ[i] == letterver2) {
                    letterver3 = SimpleEnigma.getT(3).aZ1[i];
                }
            }
            return letterver3;
        } else if (GameMaster.getO() == 5) {
			
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(0).aZ[i] == letter) {
                    letterver = SimpleEnigma.getT(0).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(1).aZ[i] == letterver) {
                    letterver1 = SimpleEnigma.getT(1).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(2).aZ[i] == letterver1) {
                    letterver2 = SimpleEnigma.getT(2).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(3).aZ[i] == letterver2) {
                    letterver3 = SimpleEnigma.getT(3).aZ1[i];
                }
            }
            for (int i = 0; i < 26; i = i + 1) {
                if (SimpleEnigma.getT(4).aZ[i] == letterver3) {
                    letterver4 = SimpleEnigma.getT(4).aZ1[i];
                }
            }
            return letterver4;
        } else {
            System.out.println("Anzahl der Räder muss zwischen 1-5 sein!");
            return 0;
        }
    
       
    }
    /**
    *
    *Diese Funktion rotiert das Rad um genau eine Stelle.
    *
    */
    public void rotate() {
        
        for (int i = 0; i < 26; i++) {
           
            for (int j = 0; j < 1; j++) {
                char k = aZ[i];
                aZ[i] = aZ[j];
                aZ[j] = k;
            }  
        }
    }
       
    /**
    *
    *Diese Funktion ist so überschrieben, 
    *dass sie die momentane Konfiguration ausgibt mit den Alphabeten geordnet.
    *@return gibt "" zurück.
    */
    @Override
    public String toString() {
        System.out.println("       Alphabeten");
        System.out.print("       ");
        System.out.println(aZ1);
        for (int r = 0; r < GameMaster.getO(); r++) {
			
            System.out.print("Rad " + (r + 1) + ": " );
			
            for (char a : SimpleEnigma.getT(r).aZ) {
                System.out.print(a);
            }
        
            System.out.println("");
        
           
        }
        return "";
    }
    /**
    *@param f bekommt die zu vergleichende Methode.
    *Die Funktion ist so überschrieben, dass sie die Konfiguration von zwei Letterwheels prüft.
    *
    *@return gibt false falls sie nicht gleich sind und true falls sie die gleiche Konfiguration haben.
    */
    @Override
    public boolean equals(Object f) {
        
        Letterwheel z = (Letterwheel) f;
        if (this.aZ[0] != z.aZ[0]) {
            return false;
        } else {
            return true;
		}
    
    }
}
