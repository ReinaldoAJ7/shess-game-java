package exceptions;

public class ChessExceptions extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public ChessExceptions(String message) {
        super(message);
    }
}
