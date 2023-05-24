/**
 * Represents a bishop chess piece.
 */
public class Bishop implements ChessPiece {
  private int row;
  private int col;
  private Color color;

  /**
   * Constructs Bishop object with row, column, and color.
   *
   * @param row position of the bishop on board
   * @param col position of the bishop on board
   * @param color color of the bishop (BLACK or WHITE)
   */
  public Bishop(int row, int col, Color color) {
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
   * Checks if the bishop can move to the specified position.
   * If difference between row movement and column movement is equal.
   * Or if their negative values are equal.
   * Bishop can move to that position.
   *
   * @param row the target row position
   * @param col the target column position
   * @return true if the bishop can move to the specified position
   */
  @Override
  public boolean canMove(int row, int col) {
    int rowMovement = this.row - row;
    int colMovement = this.col - col;

    if (rowMovement == colMovement || rowMovement == -colMovement) {
      return true;
    }
    return false;
  }

  /**
   * Checks if the bishop can kill the specified chess piece.
   * If the difference between the row movement and column movement is equal.
   * Or if their negative values are equal.
   * Bishop can attack and kill the piece.
   *
   * @param piece the chess piece to be killed
   * @return true if the bishop can kill the specified piece, false otherwise
   */
  @Override
  public boolean canKill(ChessPiece piece) {
    int targetRow = piece.getRow();
    int targetCol = piece.getColumn();
    int rowMovement = this.row - targetRow;
    int colMovement = this.col - targetCol;

    if (rowMovement == colMovement || rowMovement == -colMovement) {
      return true;
    }

    return false;
  }
}