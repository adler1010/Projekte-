import java.util.Random;
/**
*
*
*/
public class Sword extends Weapon {

    private int schadenswert;
    
    
/**
*
*
*/
	public Sword() {
    
	}

/**
*@return .
*
*/    
    public int dealDamage() {
		Random random = new Random();
		int min = 20;
		int max = 30;
		this.schadenswert = min + random.nextInt(max - min + 1);
        return schadenswert;
    
    }
}
