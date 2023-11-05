import java.util.InputMismatchException;
import java.util.Scanner;

/**
* 
* 
*Diese Klasse behandelt die Nutzereingaben. Hierbei ist es dem
*Nutzer freigestellt eine Zahl als Kommandozeilenargument oder per Konsole einzugeben.
*/
class Main {
    /**
    * 
    *Diese Methode behandelt die Nutzereingaben und es ist dem
    *Nutzer freigestellt eine Zahl als Kommandozeilenargument oder per Konsole einzugeben.
    *Try sucht den Feheler aus ,falls es gibt und catch behandelt ihn demensprechend .
    * @param args falls der Nutzer eine Zahl eingibt.
    */
    public static void main(String[] args) {
	
        Scanner read = new Scanner(System.in);
        int input = 0;       
        try {   
            
            if (args.length == 0) {
			
                System.out.print("Please type the numerical code you want to create: ");
				input = read.nextInt();
                
            } else {
				input = Integer.parseInt(args[0]);
            }
            Code code = new Code(input);
            System.out.println();
            System.out.println("The code " + code.toString() + " was created.");    
		
        } catch (InputMismatchException e) {
            WrongInputException ame = new WrongInputException(read.next());
            System.out.println("InputMismatchException  " + ame.getMessage());
        } catch (NumberFormatException w) {
            WrongInputException ame1 = new WrongInputException(Integer.toString(input));
            System.out.print("NumberFormatException " + ame1.getMessage());
        }
    }
}

