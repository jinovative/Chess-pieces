/**
 * Represents a pawn chess piece.
 */
public class Pawn implements ChessPiece {
  private int row;
  private int col;
  private Color color;

  /**
   * Constructs Pawn object with row, column, and color.
   *
   * @param row position of the pawn on board
   * @param col position of the pawn on board
   * @param color color of the pawn (BLACK or WHITE)
   * @throws IllegalArgumentException if the row or column value is negative
   */
  public Pawn(int row, int col, Color color) {
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
   * Checks if the pawn can move.
   * For a white pawn, it can move forward one row.
   * For a black pawn, it can move forward one row.
   *
   * @param row target row position
   * @param col target column position
   * @return true if the pawn can move to the specified position
   */
  @Override
  public boolean canMove(int row, int col) {
    if (color == Color.WHITE) {
      return (row == this.row + 1 && col == this.col);
    } else {
      return (row == this.row - 1 && col == this.col);
    }
  }


  /**
   * Checks if the pawn can kill.
   * For a white pawn, it can capture diagonally forward one row.
   * For a black pawn, it can capture diagonally forward one row.
   *
   * @param piece chess piece to be killed
   * @return
   */
  @Override
  public boolean canKill(ChessPiece piece) {
    int targetRow = piece.getRow();
    int targetCol = piece.getColumn();
    if (color == Color.WHITE) {
      return (targetRow == this.row + 1 && Math.abs(targetCol - this.col) == 1);
    } else {
      return (targetRow == this.row - 1 && Math.abs(targetCol - this.col) == 1);
    }
  }
}