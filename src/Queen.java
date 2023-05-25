/**
 * Represents a queen chess piece.
 */
public class Queen implements ChessPiece {
  private int row;
  private int col;
  private Color color;

  /**
   * Constructs Queen object with row, column, and color.
   *
   * @param row position of the queen on board
   * @param col position of the queen on board
   * @param color color of the queen (BLACK or WHITE)
   * @throws IllegalArgumentException if the row or column value is negative
   */
  public Queen(int row, int col, Color color) {
    if (row < 0 || col < 0) {
      throw new IllegalArgumentException("Invalid row or column value");
    }
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
   * Queen can move in four ways.
   * Horizontally, Vertically, and Diagonally.
   *
   * @param row target row position
   * @param col target column position
   * @return true if the queen can move to the specified position
   */
  @Override
  public boolean canMove(int row, int col) {
    int rowMovement = this.row - row;
    int colMovement = this.col - col;

    return (this.row == row || this.col == col ||
            rowMovement == colMovement || rowMovement == -colMovement);
  }

  /**
   * Checks if the queen can move to the target piece's position.
   *
   * @param piece chess piece to be killed
   * @return true if the queen can kill the specified piece, false otherwise
   */
  @Override
  public boolean canKill(ChessPiece piece) {
    return canMove(piece.getRow(), piece.getColumn());
  }
}