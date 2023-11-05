
/**
 * 
 * 
 */
public class Wizard implements Player {
    
    private static int x;
    private static int y;
    Item item = new Item();
    private String[] inventar =  new String[20];
    
    /**
     * 
     */
    public void inventar() {   
        
        for (int j = 0; j < inventar.length; j++) {
            
            if (inventar[j] == null) {
                inventar[j] = " ";
            }
            
        }
    
    }
    private static String a;
    
    /**
     * 
     * @param itemName .
     */
    @Override
    public void takeItem(String itemName) {
        
        a = itemName;
        
        
        for (int i = 0; i < 5; i++) {
            if (" ".equals(inventar[i])) {
                inventar[i] = a;
                break;
            } 
        }
    }
    /**
     * 
     */
    @Override
    public void putItemDown() {
        int i = 0;
        do {
            
            if ("I".equals(inventar[i])) {
                inventar[i] = " ";
                break;
            } 

            i++;
        } while (i < inventar.length);
            
        
    }
    /**
     * 
     */
    @Override
    public void printInventory() {
        System.out.print("Inventar ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" : " + inventar[i] );
        }
        System.out.println("");
    }
    /**
     * 
     * @return .
     */
    @Override
    public int getXPlayer() {
        return x;
    }
    /**
     * 
     * @param x .
     */
    @Override
    public void setXPlayer(int x) {
        this.x = x;
    }
    /**
     * 
     * @return .
     */
    @Override
    public int getYPlayer() {
        return y;
    }
    /**
     * 
     * @param y .
     */
    @Override
    public void setYPlayer(int y) {
        this.y = y;
    }
}
