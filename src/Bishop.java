public class Bishop implements ChessPiece {
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

    if (rowMovement == colMovement || rowMovement == -colMovement) {
      return true;
    }
    return false;
  }

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