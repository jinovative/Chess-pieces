interface ChessPiece {
  int getRow();
  int getColumn();
  Color getColor();
  boolean canMove(int row, int col);
  boolean canKill(ChessPiece piece);
}

public class Bishop implements ChessPiece {
  private int row;
  private int col;
  private Color color;
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
