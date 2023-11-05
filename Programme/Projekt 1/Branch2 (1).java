import  java.util.Scanner;
public class Branch2 {
	public static void main(String[]args){
		selberRaten();
	}
	public static void selberRaten(){

		int zahl = (int)(Math.random()*101);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Raten Sie eine Zahl");


		int nextNumber;

		do
		{
			nextNumber = sc.nextInt();

			if ( nextNumber < zahl)
			{
				System.out.println("Ihre Zahl ist kleiner");
			}
			else if ( nextNumber > zahl)
			{
				System.out.println("Ihre Zahl ist größer");
			}
			else if ( nextNumber == zahl )
			{
			System.out.println("Die Zahl ist Richtig geraten");
			}
		}
		while ( nextNumber != zahl);
	}
}
