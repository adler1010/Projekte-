
/**
 * 
 *
 */
interface Player {
    /**
     * 
     * @param itemName .
     */
    void takeItem(String itemName);
    /**
     * 
     */
    void  putItemDown();
    /**
     * 
     */
    void printInventory();
    /**
     * 
     * @return .
     */
    int getXPlayer();
    /**
     * 
     * @return .
     */
    int getYPlayer();
    /**
     * 
     * @param x .
     */
    void setXPlayer(int x);
    /**
     * 
     * @param y .
     */
    void setYPlayer(int y);
    
}
