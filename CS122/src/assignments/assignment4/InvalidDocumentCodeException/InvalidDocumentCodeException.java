package assignments.assignment4.InvalidDocumentCodeException;

public class InvalidDocumentCodeException extends Exception{

    String errorMsg ;

    public InvalidDocumentCodeException(String s){

        this.errorMsg = s;

    }

    public String toString(){

        return (errorMsg ) ;

    }

}
