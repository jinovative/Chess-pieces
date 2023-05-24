/**
 * Represents a rook chess piece.
 */
public class Rook implements ChessPiece {
    private int row;
    private int col;
    private Color color;

    /**
     * Constructs Rook object with row, column, and color.
     *
     * @param row position of the rook on board
     * @param col position of the rook on board
     * @param color color of the rook (BLACK or WHITE)
     */
    public Rook(int row, int col, Color color) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

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

    /**
     * Checks if the rook can move to the specified position.
     * If the row or column of the target position matches.
     *
     * @param row target row position
     * @param col target column position
     * @return true if the rook can move to the specified position
     */
    @Override
    public boolean canMove(int row, int col) {
        int rowMovement = this.row - row;
        int colMovement = this.col - col;

        if (this.row == row || this.col == col) {
            return true;
        }

        return false;
    }

    /**
     * Checks if the rook can kill the specified chess piece.
     *
     * @param piece chess piece to be killed
     * @return true if the rook can kill the specified piece, false otherwise
     */
    @Override
    public boolean canKill(ChessPiece piece) {
        return canMove(piece.getRow(), piece.getColumn());
    }
}