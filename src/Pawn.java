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
        if (color == Color.WHITE) {
            if (row == this.row - 1 && col == this.col) {
                return true;
            }
        } else {
            if (row == this.row + 1 && col == this.col) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean canKill(ChessPiece piece) {
        int targetRow = piece.getRow();
        int targetCol = piece.getColumn();
        if (color == Color.WHITE) {
            if (targetRow == this.row - 1 && Math.abs(targetCol - this.col) == 1) {
                return true;
            }
        } else {
            if (targetRow == this.row + 1 && Math.abs(targetCol - this.col) == 1) {
                return true;
            }
        }
        return false;
    }
}