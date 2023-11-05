/**
 *
 *
 */
public class Code {
    /**
    *digit speichert die Zahlen einzeln.
    *subcode speichert den rest der Zahlen.
    *eingabe speicher die ganze Eingabe der Nutzer.
    */
    private int digit;
    private Code subcode;
    private String eingabe;
    
    
    /**
    *@param input bekommt die Eingabe des Netzers übergeben.
    *Dieses Konstruktur speichert input in eingabe.
    */
    public Code(int input) {
        eingabe = Integer.toString(input);
    }
    /**
    *Diese Methode ist so überschrieben, dass sie die erste Position in digit speichrt,
    *eine Variable ausgabe erstellt und in das digit speichert,
    *if Abfrage zum Beenden der Rikursion,
    *und
    *@return da wo die Rikursion funktioniert.
    */
    @Override
    public String toString() {
        this.digit = Integer.parseInt(eingabe.substring(0, 1));
        String ausgabe = "" + digit;
        if ( 1 == eingabe.length()) {
            return ausgabe;
        } 
        subcode = new Code(Integer.parseInt(eingabe.substring(1, eingabe.length())));
        return ausgabe + subcode;
            
    }
   
}
