
import java.util.Random;

/**
 *
 *
 */
 
public class Map {
 
 /**
 *
 *
 */
    public static String[][] karte;
    private static String retvr; 
    private Item item = new Item("Ring", 'R');
    private Item item1 = new Item("Schwert", 'I');
    private Obstacle obstacle = new Obstacle("Obstacle");
    private Wizard wizard = new Wizard();
    /**
     * 
     */
    public Map() {
        
    }
	/**
     * 
     */
    public void retrieveItem() {
        
        
        for (int i = 1; i <= karte.length + 2; i++) {
            System.out.print("-" + "  ");   
        }
        System.out.print("\n");
        for (int i = 0; i < karte.length; i++) {
            System.out.print("|  ");
            for (int j = 0; j < karte.length; j++) {
                if (karte[i][j] == null) {
                    karte[i][j] = " ";
                }
                System.out.print(karte[i][j] + "  ");  
            }
            System.out.print("| " + "\n");
            
        }
        for (int i = 1; i <= karte.length + 2; i++) {
            System.out.print("-" + "  ");   
        }
        System.out.println("");
        
    }
    /**
     * 
     */
    public void placeMapItem() {
      
        
        
        Random random = new Random();
        int min1 = 0;
        int max1 = karte.length - 1;
        
        int i = 0;
        
        do {
		
            int length = min1 + random.nextInt(max1 - min1 + 1); 
            int width = min1 + random.nextInt(max1 - min1 + 1);	
            karte[length][width] = Character.toString(item1.getSymbol());
            if (length == 0 && width == 0) { 
				karte[length][width] = " ";		
                i--;
            }
                
            int length1 = min1 + random.nextInt(max1 - min1 + 1); 
            int width1 = min1 + random.nextInt(max1 - min1 + 1);
            karte[length1][width1] = Character.toString(obstacle.getSymbol());
            if (length1 == 0 && width1 == 0 ) { 
                karte[length1][width1] = " ";		
                i--;
            }
		
            for (int q = 0; q < i; q++) {
				
				if (karte[length][width] == karte[length1][width1] ) { 
					i--;
				}
            }
				
            i++;	    
				
		} while (i < karte.length);
        
        
        
        for (int k = 1; k <= 1; k++) {
            int length2 = min1 + random.nextInt(max1 - min1 + 1); 
            int width2 = min1 + random.nextInt(max1 - min1 + 1);
            if (length2 == 0 && width2 == 0 ) { 		
                k--;
            } else {
                karte[length2][width2] = Character.toString(item.getSymbol());
            }
        }
        int len = 0;
        int wid = 0;
        karte[len][wid] = "P";
        wizard.setXPlayer(len);
        wizard.setYPlayer(wid);
    }

    /**
     * 
     * @param x .
	 * @param y .
	 * @param x1 .
	 * @param y1 .
     * @return .
     */
    public int checkCoordinates(int x, int y, int x1, int y1) {
        
        
        if (x + 1 >= karte.length ) {
                 
            System.out.println("Sie befinden sich außehalb der Karte");
            return 0;
        } else if (x1 - 1 < 0 ) {
                 
            System.out.println("Sie befinden sich außehalb der Karte");
            return 0;
        } else if (y + 1 >= karte.length ) {
                 
            System.out.println("Sie befinden sich außehalb der Karte");
            return 0;
        
        } else if (y1 - 1 < 0 ) {
                 
            System.out.println("Sie befinden sich außehalb der Karte");
            return 0;
        } else {
            
        
			return 1;
        }
    }
}
