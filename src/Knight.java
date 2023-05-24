

/**
 * Represents a knight chess piece.
 */
public class Knight implements ChessPiece {
  private int row;
  private int col;
  private Color color;

  /**
   * Constructs Knight object with row, column, and color.
   *
   * @param row position of the knight on board
   * @param col position of the knight on board
   * @param color color of the knight (BLACK or WHITE)
   */
  public Knight(int row, int col, Color color) {
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
   * Knight can move to the specified position on the chessboard.
   * checks if the row and column differences match.
   * Any of the eight possible L-shaped movements.
   *
   * @param row target row position
   * @param col target column position
   * @return true if the knight can move to the specified position
   */
  @Override
  public boolean canMove(int row, int col) {
    int rowMovement = this.row - row;
    int colMovement = this.col - col;

    if ((rowMovement == 2 && colMovement == 1)
            || (rowMovement == 1 && colMovement == 2)
            || (rowMovement == -2 && colMovement == 1)
            || (rowMovement == -1 && colMovement == 2)
            || (rowMovement == 2 && colMovement == -1)
            || (rowMovement == 1 && colMovement == -2)
            || (rowMovement == -2 && colMovement == -1)
            || (rowMovement == -1 && colMovement == -2)) {
      return true;
    }

    return false;
  }

  /**
   * Checks if the knight can move to the target piece's position.
   * color is different from the color of the target piece.
   *
   * @param piece chess piece to be killed
   * @return true if the knight can kill the specified piece, false otherwise
   */
  @Override
  public boolean canKill(ChessPiece piece) {
    return canMove(piece.getRow(), piece.getColumn()) && color != piece.getColor();
  }
}

