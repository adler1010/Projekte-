
import java.util.Scanner;

/**
 * 
 * 
 */
public class GameMaster {
    /**
     * 
     * @param args .
     */
    public static void main(String[] args) {
        
        Wizard wizard = new Wizard();
        Item item = new Item();
        Item item1 = new Item();
        Obstacle obstacle = new Obstacle();
        Scanner input = new Scanner(System.in);
        wizard.inventar();
        
        System.out.println("Welcome to Middle-earth.");
        System.out.println("Choose your hero");
        
        String heroName = input.nextLine();
        
        System.out.println("Choose the size of the map as of 6! " );
        
        int g1 = input.nextInt();
        Map map = new Map();
        map.karte = new String[g1][g1];
        
        System.out.println("You have chosen a " + g1 + "x" + g1 + " map. " );
        System.out.println("You have chosen the " + heroName + " as your hero.");
        System.out.println("Study the map and choose your path wisely.");
        
        map.placeMapItem();
        map.retrieveItem();
        
        String inputAktion;
        inputAktion = input.nextLine();
       
        boolean wennR = true;
        do {
            
            int x = wizard.getXPlayer();
            int y = wizard.getYPlayer();
            
            System.out.println("What do you want to do?  N : W : S : E : map : inv : drop");
            inputAktion = input.nextLine();
            
            if (inputAktion.equals("N")) {
                
                if (map.checkCoordinates(-1, -1, x, 500) == 0) {
					System.out.println("");
                   
                } else {
                    
                   
             
                    switch (map.karte[x - 1][y]) {
                        
                        case "#" :
                        
                            System.out.println("Es gibt hier Hindernis!");
                            break;
                        
                        case " " :
                        
                            map.karte[x][y] = " ";
                            wizard.setXPlayer(x - 1);
                            map.karte[x - 1][y] = "P";
                            System.out.println("Gone N");
                            break;
                        
                        case "I" :
                        
                            map.karte[x][y] = " ";
                            wizard.setXPlayer(x - 1);
                            map.karte[x - 1][y] = "P";
                            System.out.println("Gone N");
                            System.out.println("Now you are on the item. " + "\n" + "What do you want to do?" + "\n" + "take or leave");
                            String input1 = input.nextLine();
                        
                            if ("take".equals(input1)) {
                                
                                wizard.takeItem("I");
                                System.out.println(item1.getName() + " wurde aufgenommen.");
                                
                            } else if ("leave".equals(input1)) {
                                
                                System.out.println("What do you want to do? N : W : S : E ");
                                String input2 = input.nextLine();
                                
                                if ("N".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    map.karte[x - 1][y] = "P";
                                    System.out.println("Gone N");
                                    wizard.setXPlayer(x - 1);
                                    
                                } else if ("S".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setXPlayer(x + 1);
                                    map.karte[x + 1][y] = "P";
                                    System.out.println("Gone S");
                                    
                                } else if ("E".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setYPlayer(y + 1);
                                    map.karte[x][y + 1] = "P";
                                    System.out.println("Gone E");
                                    
                                } else if ("W".equals(input2)) {
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setYPlayer(y - 1);
                                    map.karte[x][y - 1] = "P";
                                    System.out.println("Gone W");
                                }
                            }
                        
                            break;
                            
                        case "R" :
                            
                            map.karte[x][y] = " ";
                            wizard.setXPlayer(x - 1);
                            map.karte[x - 1][y] = "P";
                            System.out.println("Gone N");
                            System.out.println("Now you are on the ring. put (take) to take it! ");
                            input1 = input.nextLine();
                            
                            if ("take".equals(input1)) {
                            
                                wizard.takeItem("R");
                                System.out.println("You took the ring, your next quest will be to bring it to Mount Doom!");
                                wennR = false;
                            }
                            break;
                            
                    }
                }   
            } else if (inputAktion.equals("E")) {
                
                if ( map.checkCoordinates(-1, y, 5, 500) == 0) {
					System.out.println("");
                   
                } else {
                
                    switch (map.karte[x][y + 1]) {
                        
                        case "#" :
                        
                            System.out.println("Es gibt hier ein Hindernis!");
                            break;
                           
                        case " " :
                              
                            map.karte[x][y] = " ";
                            wizard.setYPlayer(y + 1);
                            map.karte[x][y + 1] = "P";
                            System.out.println("Gone E");
                            break;
                            
                        case "I" :
                        
                            map.karte[x][y] = " ";
                            wizard.setYPlayer(y + 1);
                            map.karte[x][y + 1] = "P";
                            System.out.println("Gone E");
                        
                            System.out.println("Now you are on the item. " + "\n" + "What do you want to do?" + "\n" + "take or leave");
                            String input1 = input.nextLine();
                            
                            if ("take".equals(input1)) {
                                
                                wizard.takeItem("I");
                                System.out.println(item1.getName() + " wurde aufgenommen.");  
                                
                            } else if ("leave".equals(input1)) {
                                
                                System.out.println("What do you want to do? N : W : S : E");
                                String input2 = input.nextLine();
                                
                                if ("N".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    map.karte[x - 1][y] = "P";
                                    System.out.println("Gone N");
                                    wizard.setXPlayer(x - 1);
                                    
                                } else if ("S".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setXPlayer(x + 1);
                                    map.karte[x + 1][y] = "P";
                                    System.out.println("Gone S");
                                    
                                } else if ("E".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setYPlayer(y + 1);
                                    map.karte[x][y + 1] = "P";
                                    System.out.println("Gone E");
                                    
                                } else if ("W".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setYPlayer(y - 1);
                                    map.karte[x][y - 1] = "P";
                                    System.out.println("Gone W");
                                }
                            }
                            break;
                            
                        case "R" :
                            
                            map.karte[x][y] = " ";
                            wizard.setXPlayer(y + 1);
                            map.karte[x][y + 1] = "P";
                            System.out.println("Gone N");
                            System.out.println("Now you are on the ring. put (take) to take it! ");
                            input1 = input.nextLine();
                            
                            if ("take".equals(input1)) {
                            
                                wizard.takeItem("R");
                                System.out.println("You took the ring, your next quest will be to bring it to Mount Doom!");
                                wennR = false;
                            
                            }
                            break;
                    }
                }
            } else if (inputAktion.equals("W")) { 
                
                if ( map.checkCoordinates(-1, -1, 5, y) == 0) {
					System.out.println("");
                   
                } else {
                    
                
                    switch ( map.karte[x][y - 1]) {
                        
                        case "#" :
                            
                            System.out.println("Es gibt hier ein Hindernis!");
                            break;
                            
                        case " " :
                          
                            map.karte[x][y] = " ";
                            wizard.setYPlayer(y - 1);
                            map.karte[x][y - 1] = "P";
                            System.out.println("Gone W");
                            break;
                            
                        case "I" :
                            
                            map.karte[x][y] = " ";
                            wizard.setYPlayer(y - 1);
                            map.karte[x][y - 1] = "P";
                            System.out.println("Gone W");
                        
                            System.out.println("Now you are on the item. " + "\n" + "What do you want to do?" + "\n" + "take or leave");
                            String input1 = input.nextLine();
                            
                            if ("take".equals(input1)) {
                                
                                wizard.takeItem("I");
                                System.out.println(item1.getName() + " wurde aufgenommen.");   
                                
                            } else if ("leave".equals(input1)) {
                                
                                System.out.println("What do you want to do? N : W : S : E");
                                String input2 = input.nextLine();
                                
                                if ("N".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    map.karte[x - 1][y] = "P";
                                    System.out.println("Gone N");
                                    wizard.setXPlayer(x - 1);
                                    
                                } else if ("S".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setXPlayer(x + 1);
                                    map.karte[x + 1][y] = "P";
                                    System.out.println("Gone S");
                                    
                                } else if ("E".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setYPlayer(y + 1);
                                    map.karte[x][y + 1] = "P";
                                    System.out.println("Gone E");
                                    
                                } else if ("W".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setYPlayer(y - 1);
                                    map.karte[x][y - 1] = "P";
                                    System.out.println("Gone W");
                                }
                            }
                            
                            break;
                            
                        case "R" :
                            
                            map.karte[x][y - 1] = " ";
                            wizard.setXPlayer(y - 1);
                            map.karte[x][y - 1] = "P";
                            System.out.println("Gone N");
                            System.out.println("Now you are on the Ring. put (take) to take it! ");
                            input1 = input.nextLine();
                            
                            if ("take".equals(input1)) {
                            
                                wizard.takeItem("R");
                                System.out.println("You took the ring, your next quest will be to bring it to Mount Doom!");
                                wennR = false;
                            
                            }
                            break;
                    }
                }
            } else if (inputAktion.equals("S")) {
                
                if ( map.checkCoordinates(x, -1, 5, 500) == 0) {
					System.out.println("");
                   
                } else {
                    
                
                    switch (map.karte[x + 1][y] ) {
                            
                        case "#" :
                            
                            System.out.println("Es gibt hier ein Hindernis!");
                            break;
                            
                        case " " :
                            
                            map.karte[x][y] = " ";
                            wizard.setXPlayer(x + 1);
                            map.karte[x + 1][y] = "P";
                            System.out.println("Gone S");
                            break;
                            
                        case "I" :
                            
                            map.karte[x][y] = " ";
                            wizard.setXPlayer(x + 1);
                            map.karte[x + 1][y] = "P";
                            System.out.println("Gone S");
                                    
                            System.out.println("Now you are on the item. " + "\n" + "What do you want to do?" + "\n" + "take or leave");
                            String input1 = input.nextLine();
                            
                            if ("take".equals(input1)) {
                                
                                wizard.takeItem("S");
                                System.out.println(item1.getName() + " wurde aufgenommen.");     
                                
                            } else if ("leave".equals(input1)) {
                                
                                System.out.println("What do you want to do? N : W : S : E");
                                String input2 = input.nextLine();
                                
                                if ("N".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    map.karte[x - 1][y] = "P";
                                    System.out.println("Gone N");
                                    wizard.setXPlayer(x - 1);
                                    
                                } else if ("S".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setXPlayer(x + 1);
                                    map.karte[x + 1][y] = "P";
                                    System.out.println("Gone S");
                                    
                                } else if ("E".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setYPlayer(y + 1);
                                    map.karte[x][y + 1] = "P";
                                    System.out.println("Gone E");
                                    
                                } else if ("W".equals(input2)) {
                                    
                                    x = wizard.getXPlayer();
                                    y = wizard.getYPlayer();
                                    map.karte[x][y] = "I";
                                    wizard.setYPlayer(y - 1);
                                    map.karte[x][y - 1] = "P";
                                    System.out.println("Gone W");
                                }
                            } 
                            break;
                            
                        case "R" :
                            
                            map.karte[x][y] = " ";
                            wizard.setXPlayer(x + 1);
                            map.karte[x + 1][y] = "P";
                            System.out.println("Gone N");
                            System.out.println("Now you are on the item. put (take) to take it! ");
                            input1 = input.nextLine();
                            
                            if ("take".equals(input1)) {
                            
                                wizard.takeItem("R");
                                System.out.println("You took the ring, your next quest will be to bring it to Mount Doom!");
                                wennR = false;
                            
                            
                            }
                            break;
                    }  
                } 
                        
            } else if (inputAktion.equals("map")) {
                
                map.retrieveItem();
                
            } else if (inputAktion.equals("inv")) {
                      
                wizard.printInventory();
                
            } else if (inputAktion.equals("drop")) {
                
                wizard.putItemDown();
                System.out.println(item1.getName() + " wurde auf den Boden gelegt.");
                System.out.println("What do you want to do? N : W : S : E");
                String input2 = input.nextLine();
                
                if ("N".equals(input2)) {
                    
                    if (map.checkCoordinates(-1, -1, x, 500) == 0) {
                        wizard.takeItem("I");
                        System.out.println(item1.getName() + " wurde wieder aufgenommen.");
                        
                    } else {
                        
                        x = wizard.getXPlayer();
                        y = wizard.getYPlayer();
                        map.karte[x][y] = "I";
                        map.karte[x - 1][y] = "P";
                        System.out.println("Gone N");
                        wizard.setXPlayer(x - 1);
                        
                    }
                } else if ("S".equals(input2)) {
                    
                    if ( map.checkCoordinates(x, -1, 5, 500) == 0) {
                        
                        wizard.takeItem("S");
                        System.out.println(item1.getName() + " wurde wieder aufgenommen.");
                   
                    } else {
                        
                        x = wizard.getXPlayer();
                        y = wizard.getYPlayer();
                        map.karte[x][y] = "I";
                        wizard.setXPlayer(x + 1);
                        map.karte[x + 1][y] = "P";
                        System.out.println("Gone S");
                        
                    }
                } else if ("E".equals(input2)) {
                    
                    if ( map.checkCoordinates(-1, y, 5, 500) == 0) {
               
                        wizard.takeItem("I");
                        System.out.println(item1.getName() + " wurde wieder aufgenommen.");
                        
                    } else {
                        
                        x = wizard.getXPlayer();
                        y = wizard.getYPlayer();
                        map.karte[x][y] = "I";
                        wizard.setYPlayer(y + 1);
                        map.karte[x][y + 1] = "P";
                        System.out.println("Gone E");
                        
                    }
                                    
                } else if ("W".equals(input2)) {
                    
                    if ( map.checkCoordinates(-1, -1, 5, y) == 0) {
               
                        wizard.takeItem("I");
                        System.out.println(item1.getName() + " wurde wieder aufgenommen.");
                        
                    } else {
                        
                        x = wizard.getXPlayer();
                        y = wizard.getYPlayer();
                        map.karte[x][y] = "I";
                        wizard.setYPlayer(y - 1);
                        map.karte[x][y - 1] = "P";
                        System.out.println("Gone W");
                        
                    }
                    
                } 
                
            }
                 
        } while (wennR == true);
        
    }
    
}
