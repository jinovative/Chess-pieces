

public class Knight implements ChessPiece {
  private int row;
  private int col;
  private Color color;

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

  @Override
  public boolean canKill(ChessPiece piece) {
    return canMove(piece.getRow(), piece.getColumn()) && color != piece.getColor();
  }
}

