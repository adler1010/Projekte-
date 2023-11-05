public class Branch1 {
	public static void main(String[]args){
		

		int eingabe = Integer.parseInt(args[0]);
		System.out.println(eingabe);
		int i =0;
		
       // if (args.length>=1)
		//{
		int f ;//computerRaten();
		
		do
		{
			f= computerRaten();

			if ( f == eingabe)
			{
			System.out.println(" Anzahl der Versuche :  "+i);
			}

		        i++;
		}
		while ( f != eingabe);
	//}
	}
	public static int computerRaten(){
	 	int zahl = (int)(Math.random()*101);
		return zahl;
	}
}

