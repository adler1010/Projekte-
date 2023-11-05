import java.util.Random;


/**
*
*/
public class Hobbit {
    private Ork ork = new Ork();
    private String frodo = "Frodo";
    private String sam = "Sam";
    private String meri = "Meri";
    private String pipin = "Pipin";
    private String c;
    private int zu;
    private String a;
    
    private int lPF = 100;
    private int lPS = 100;
    private int lPM = 100;
    private int lPP = 100;
    
    private Sword s = new Sword();
    private Fists p = new Fists();
/**
*@return .
*@param aura .
*@param hName .
*/
    public int heald(int aura, String hName) {
                
        if ("Frodo".equals(hName)) {
			lPF = lPF + aura;
            if (lPF >= 100) {
                    
                lPF = 100;
            }
        }
                
        if ("Sam".equals(hName)) {
            lPS = lPS + aura;
            if (lPS >= 100) {
                    
                lPS = 100;
            }
        }
                
        if ("Meri".equals(hName)) {
            lPM = lPM + aura;
            if (lPM >= 100) {
                    
                lPM = 100;
            }
        }
                
        if ("Pipin".equals(hName)) {
            lPP = lPP + aura;
            if (lPP >= 100) {
                    
                lPP = 100;
            }
        }
                
		return aura;
    }
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
*@return .
*/
    public boolean isAlive() {
        if (lPF <= 0 && lPS <= 0 && lPP <= 0 && lPM <= 0  ) {
			
			return true; 
        } else {
			return false;
		}
		
        
    }
/**
*@return .
*
*/   
    public int attack() {
        if ("Fists".equals(a)) {
			return p.getFistsOrk();
        } 
        
        if ("Sword".equals(a)) {
			return zu;
        }
        return 0;
    }
/**
*@param c .
*
*/ 
	public void nAMEN(String c) {
        this.c = c;
    } 
	
/**
*@param a .
*/
    public void recvDamage(String a) {
        this.a = a;
        if ("Fists".equals(a)) {
            
            if ("Pipin".equals(c)) {
				lPP = lPP - p.getFistsOrk();
            }
            if ("Frodo".equals(c)) {
				lPF = lPF - p.getFistsOrk();
            }
            if ("Sam".equals(c)) {
				lPS = lPS - p.getFistsOrk();
            }
            
            if ("Meri".equals(c)) {
				lPM = lPM - p.getFistsOrk();
            }
            
        }
        
        if ("Sword".equals(a)) {
			int zu = s.dealDamage();
			this.zu = zu;
            if ("Pipin".equals(c)) {
				lPP = lPP - zu;
            }
            if ("Frodo".equals(c)) {
				lPF = lPF - zu;
            }
            if ("Sam".equals(c)) {
				lPS = lPS - zu;
            }
            if ("Meri".equals(c)) {
				lPM = lPM - zu;
            }
            
        } 
        
    }

/**
*
*
*/   
    public Hobbit() {
     
    }
    
/**
*@return .
*
*/    
    public String getFrodo() {
        return frodo;
    }
/**
*@return .
*
*/    
    public String getSam() {
        return sam;
    }
/**
*@return .
*
*/    
    public String getMeri() {
        return meri;
    }
/**
*@return .
*
*/    
    public String getPipin() {
        return pipin;
    }
/**
*
*
*@return . 
*/
    public int getLPF() {
        return lPF;
    }
/**
*@return .
*
*/    
    public int getLPS() {
        return lPS;
    }
/**
*@return .
*
*/    
    public int getLPM() {
        return lPM;
    }
/**
*@return .
*
*/    
    public int getLPP() {
        return lPP;
    }

}
