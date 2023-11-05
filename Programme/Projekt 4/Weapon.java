/**
*
*
*/
public class Weapon {
    private String name;
    private int damage;
/**
*
*
*/    
    public Weapon() {
    }
/**
*@param name ist Variable.
*
*/    
    public Weapon(String name) {
        this.name = name;
    }
    
/**
*@return .
*@param name.
*/    
    public int dealDamage() {
        
        return damage;
    }
/**
*
*@return .
*/    
    public String getName() {
        return name;
    }
    
}