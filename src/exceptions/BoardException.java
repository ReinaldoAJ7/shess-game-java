package exceptions;

public class BoardException extends RuntimeException{
    private static long serialVersionUID = 1l;

    public BoardException(String message) {
        super(message);
    }
}
