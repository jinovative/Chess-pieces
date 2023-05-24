/**
 * Represents guideline chess piece's movements.
 */
public interface ChessPiece {

  /**
   * Gets row of chess piece.
   *
   * @return row position of chess piece
   */
  int getRow();

  /**
   * Gets colum of chess piece.
   *
   * @return colum position of chess piece
   */
  int getColumn();

  /**
   * Gets color of chess piece.
   *
   * @return color of chess piece (BLACK or WHITE)
   */
  Color getColor();

  /**
   * Checks if the chess piece can move to specified position.
   *
   * @param row target row position
   * @param col target column position
   * @return true if the chess piece can move to specified position, false otherwise
   */
  boolean canMove(int row, int col);

  /**
   * Checks if the chess piece can kill specified chess piece.
   *
   * @param piece chess piece to be killed
   * @return true if the chess piece can kill the specified piece, false otherwise
   */
  boolean canKill(ChessPiece piece);
}

