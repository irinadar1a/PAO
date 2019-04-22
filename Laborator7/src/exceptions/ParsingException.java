package exceptions;

public class ParsingException extends Exception {

    public ParsingException() {
    }

    public ParsingException(String message, String parsedText) {
        System.out.println(parsedText + " could not be parsed!");
        System.out.println("Exception thrown with message: " + message);
    }
}
