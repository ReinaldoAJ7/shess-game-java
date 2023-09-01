package boardgame;

public abstract class Piece extends Position{
    protected Position position;

    public Piece() {
    }

    public Piece(int row, int column, Position position) {
        super(row, column);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean possibleMoves(){
        return false;
    }

    public boolean possibleMove(Position position){
        return false;
    }

    public boolean isThereAnyPositionMove(){
        return false;
    }
}
