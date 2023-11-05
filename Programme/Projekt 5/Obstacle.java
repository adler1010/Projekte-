/**
 * 
 * 
 */

public class Obstacle implements MapObject {

    private String name;
    
    /**
     * 
     * @param name 
     */
    public Obstacle(String name) {
        this.name = name;
    }
    /**
     * 
     */
    public Obstacle() {
       
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
        return '#';
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
     * @return .
     */
    @Override
    public boolean getCollision() {
        return false;
    }
    
    
}
