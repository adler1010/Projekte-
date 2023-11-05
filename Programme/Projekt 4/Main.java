

/**
*
*/
public class Main {
 

    public static void main(String[] args) {
       
        MagicWand c1 = new MagicWand("blau", 5);
        MagicWand c2 = new MagicWand("green", 9);    
    
        
        if (c1.getStrength() > c2.getStrength()) {
			System.out.print("The blue staff with strength " + c1.getStrength() );
			System.out.println(" is stronger then the green staff with strength " + c2.getStrength() + ".");
        } else {
			System.out.print("The green staff with strength " + c2.getStrength());
			System.out.println(" is stronger then the blue staff with strength " + c1.getStrength() + ".");
        }   
        
        MagicWand c3 = new MagicWand("Red", 10);
        MagicWand c4 = new MagicWand("Red", 10);
        System.out.println("The staffs are the same: " + c3.equals(c4));
        
        
	}
}

