import java.util.Random;
/**
*
*
*/
public class Battle {

    public static void main(String[] args) {
    
        Hobbit hobbit = new Hobbit();
		Random random = new Random();
        int min = 0;
		int max = 15;
        Weapon frodow = new Weapon(hobbit.zuW());
        Weapon samw = new Weapon(hobbit.zuW());
        Weapon meriw = new Weapon(hobbit.zuW());
        Weapon pipinw = new Weapon(hobbit.zuW());
		
                
		int i = 1;
    
		System.out.println("Round " + i + ":");
		System.out.println("An ork emerges, ready for battle!");
    
                
                
		
		for (; i <= 10; i++) {
                        
                        
			if (i >= 2) {
				System.out.println("Round " + i + ":");
			}
                        
                        
			Ork ork = new Ork();
            Weapon orks = new Weapon(ork.zuW());
                        
            ork.lEBENSP();
            
			
			for (int j = 1; j <= 10; j++) {
                                
                                
                if (hobbit.getLPF() > 0 ) {
                    ork.namen(hobbit.getFrodo());
					ork.recvDamage(frodow.getName());    
					System.out.println(ork.namen(hobbit.getFrodo()) + " [Sting ("  + frodow.getName() + ")] dealt " + ork.attack() + " damage.");
					if (ork.isAlive() == true || hobbit.isAlive() == true) {
                                    
						break;
					}
                    hobbit.nAMEN(hobbit.getFrodo());
					hobbit.recvDamage(orks.getName());
					System.out.println("Orc ["  + orks.getName() + "] dealt " + hobbit.attack() + " damage.");
					if (ork.isAlive() == true || hobbit.isAlive() == true) {
                                    
						break;
					}
                } 
				
                                
                                
                                
                if (hobbit.getLPM() > 0) {
                    ork.namen(hobbit.getMeri());
					ork.recvDamage(meriw.getName());   
					System.out.println(ork.namen(hobbit.getMeri()) + " ["  + meriw.getName() + "] dealt " + ork.attack() + " damage.");
					if (ork.isAlive() == true || hobbit.isAlive() == true) {
                                    
						break;
					}
                    hobbit.nAMEN(hobbit.getMeri());
					hobbit.recvDamage(orks.getName());
					System.out.println("Orc ["  + orks.getName() + "] dealt " + hobbit.attack() + " damage.");
					if (ork.isAlive() == true || hobbit.isAlive() == true) { 
                                    
						break;
					}
                } 
				
                                
                                
                                
                if (hobbit.getLPS() > 0 ) {
                    ork.namen(hobbit.getSam());
					ork.recvDamage(samw.getName());    
					System.out.println(ork.namen(hobbit.getSam()) + " ["  + samw.getName() + "] dealt " + ork.attack() + " damage.");
					if (ork.isAlive() == true || hobbit.isAlive() == true) {
                                    
						break;
					}
                    hobbit.nAMEN(hobbit.getSam());
					hobbit.recvDamage(orks.getName());
					System.out.println("Orc ["  + orks.getName() + "] dealt " + hobbit.attack() + " damage.");
					if (ork.isAlive() == true || hobbit.isAlive() == true) {
                                   
						break;
					}
                }
				
                                
                                
                                
                if (hobbit.getLPP() > 0) {
                    ork.namen(hobbit.getPipin());
					ork.recvDamage(pipinw.getName());   
				    System.out.println(ork.namen(hobbit.getPipin()) + " ["  + pipinw.getName() + "] dealt " + ork.attack() + " damage.");
					if (ork.isAlive() == true || hobbit.isAlive() == true) {
                                    
						break;
					}
                    hobbit.nAMEN(hobbit.getPipin());
					hobbit.recvDamage(orks.getName());
					System.out.println("Orc ["  + orks.getName() + "] dealt " + hobbit.attack() + " damage.");
					if (ork.isAlive() == true || hobbit.isAlive() == true) { 
                                    
						break;
					}
                } 
				
                                
                                
                                
                                
    
				               
				int heald = min + random.nextInt(max - min + 1);    
				ork.heald(heald);
				if (hobbit.getLPF() > 0) {
					hobbit.heald(heald, hobbit.getFrodo());
				}
				if (hobbit.getLPM() > 0) {
					hobbit.heald(heald, hobbit.getMeri());
				}
				if (hobbit.getLPS() > 0) {
					hobbit.heald(heald, hobbit.getSam());
				}
				if (hobbit.getLPP() > 0) {
					hobbit.heald(heald, hobbit.getPipin());
				}
				System.out.println("The Aura healed everybody by  " + heald);
    
				
			}
			
            if (hobbit.isAlive() == true) { 
                if (hobbit.isAlive() == true) {
                    System.out.println("The Hobbits died!");
                }
				break; 	
			}
			
			
            
			int heald = min + random.nextInt(max - min + 1);
                  
            if (hobbit.getLPF() > 0) {
                hobbit.heald(heald, hobbit.getFrodo());
            }
            if (hobbit.getLPM() > 0) {
                hobbit.heald(heald, hobbit.getMeri());
            }
            if (hobbit.getLPS() > 0) {
                hobbit.heald(heald, hobbit.getSam());
            }
            if (hobbit.getLPP() > 0) {
                hobbit.heald(heald, hobbit.getPipin());
            }
                        
			System.out.println("The Aura healed everybody by  " + heald);
                         
		}
		
	}
}