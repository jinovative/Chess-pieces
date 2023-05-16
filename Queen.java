interface ChessPiece {
  int getRow();
  int getColumn();
  Color getColor();
  boolean canMove(int row, int col);
  boolean canKill(ChessPiece piece);
}

public class Queen implements ChessPiece {
  @Override
  public int getRow() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }

  @Override
  public Color getColor() {
    return null;
  }

  @Override
  public boolean canMove(int row, int col) {
    return false;
  }

  @Override
  public boolean canKill(ChessPiece piece) {
    return false;
  }
}
