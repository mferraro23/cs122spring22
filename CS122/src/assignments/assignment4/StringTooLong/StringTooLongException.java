package assignments.assignment4.StringTooLong;

public class StringTooLongException extends Exception{
    public StringTooLongException(){}
    public StringTooLongException(String message) {
        super(message);
    }

    public String getMessage() {
        return "String is too long";
    }
}