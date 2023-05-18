public class Pawn implements ChessPiece {
    private int row;
    private int col;
    private Color color;
    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return col;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public boolean canMove(int row, int col) {
        return false;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        return false;
    }
}