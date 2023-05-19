public class Rook implements ChessPiece {
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
        int rowMovement = this.row - row;
        int colMovement = this.col - col;

        if (this.row == row || this.col == col) {
            return true;
        }

        return false;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        return canMove(piece.getRow(), piece.getColumn());
    }
}