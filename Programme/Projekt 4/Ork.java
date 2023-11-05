import java.util.Random;


/**
*
*
*/
public class Ork {
    
        
          
        
    private int lP;
    private int lP1;
    private String hNamen;
	private int zu;
	private String a;
    
    
    
    private Fists p = new Fists();
    private Sword s = new Sword();
/**
*@return .
*
*/
    public String zuW() {
        Random random = new Random();
        int min1 = 1;
        int max1 = 2;
        int f = min1 + random.nextInt(max1 - min1 + 1);
        
        if (f == 1) {
            return "Sword";
        } else if (f == 2) {
            return "Fists";
        } else {
            return null;
        }
    }
/**
*
*/    
    public void lEBENSP() {
        Random random1 = new Random();
        int min2 = 80;
        int max2 = 150;
        int lP = min2 + random1.nextInt(max2 - min2 + 1);
        this.lP = lP;
        this.lP1 = lP;
    }
/**
*@return .
*@param aura .
*/   
    public int heald(int aura) {
        lP = lP + aura;
        if (lP >= lP1) {
            lP = lP1;
        }
        
        return aura;
    }
    
    
/**
*
*@return .
*/    
    public boolean isAlive() {
        if (lP <= 0) {
            System.out.println("The Ork died!");
			return true; 
        } else {
            return false;
		}
		
    }
/**
*@return .
*@param b .
*/    
    
    public String namen(String b) {
        this.hNamen = b;
        return hNamen;
    }
    public String getHNamen() {
        return hNamen;
    }
/**
*
*@param a .
*/     
    public void recvDamage(String a) {
        this.a = a;
        if ("Fists".equals(a)) {
			if (hNamen.equals("Frodo")) {
				lP = lP - p.getFistsFrodo();
			}
          
			if (hNamen.equals("Sam")) {
				lP = lP - p.getFistsSam();
  
			}
          
			if (hNamen.equals("Meri")) {
				lP = lP - p.getFistsMeri();
           
			}
          
			if (hNamen.equals("Pipin")) {
				lP = lP - p.getFistsPipin();
           
			}
   
        } 
        if ("Sword".equals(a)) {
			int zu = s.dealDamage();
			this.zu = zu;
			lP = lP - zu;
           
        } 
    }
/**
*@return .
*
*/	
    public int attack() {    
        if ("Fists".equals(a)) {
			if (hNamen.equals("Frodo")) {
				return p.getFistsFrodo();
			}
          
			if (hNamen.equals("Sam")) {
				return p.getFistsSam();
			}
          
			if (hNamen.equals("Meri")) {
				return p.getFistsMeri();
			}
          
			if (hNamen.equals("Pipin")) {
				return p.getFistsPipin();
			}
        } else if ("Sword".equals(a)) {
            return zu;
        }
		return 0;
          
    }
    
  
/**
*
*
*/
    
 
    
    public Ork() {
        
    }
    
	
}
