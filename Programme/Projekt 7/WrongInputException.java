/**
 *Diese Klasse ist unser Eigenes Exception.
 *
 */

public class WrongInputException extends Exception {
    /**
    *Dieses Kustruktur bekommt den falschenInput und wirft ihn ins SuperKlasse .
    *@param falschenInput bekommt das falsche Input.
    */    
    public WrongInputException(String falschenInput) {
        super(falschenInput);
    }
}
