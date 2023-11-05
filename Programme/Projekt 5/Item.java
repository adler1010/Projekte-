
/**
 * 
 * 
 */
public class Item implements MapObject {

    static private String name;
    private char symbol;
    /**
     * 
     */
    public Item() {
        
    }
    /**
     * 
     * @param name .
     * @param symbol .
     */
    public Item(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    /**
     * 
     * @return .
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * 
     * @return .
     */
    @Override
    public char getSymbol() {
        return symbol;
    }
    /**
     * 
     * @return .
     */
    @Override
    public boolean isLootable() {
        return false;
    }
    /**
     * 
     * @return 
     */
    @Override
    public boolean getCollision() {
        return false;
    }
    
    
}
