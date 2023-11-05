/**
*
*
*/
public class MagicWand {
    private String color;
    private int strength;
/**
*
*
*/   
    public MagicWand() {
        
    }
/**
*@param strength .
*@param color .
*/
    public MagicWand(String color, int strength) {
        this.color = color;
        this.strength = strength;
    }
/**
*@return .
*
*/   
    public String getColor() {
        return color;
    }
/**
*@return .
*
*/	
    public int getStrength() {
        return strength;
    }
/**
*
*
*/
    void printL() {
        System.out.println(color + "" + strength);
    }
/**
*@param f .
*
*/	
    @Override
    public boolean equals(Object f) {
        if (!(f instanceof MagicWand)) {
            return false;
        }
        MagicWand z = (MagicWand) f;
        if (this.color != z.color) {
            return false;
        }
        if (this.strength != z.strength) {
            return false;
        } else {
			return true;
		}
    
	}
}
