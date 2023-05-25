import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class QueenTest {

  @Test
  public void testCanMove() {
    Queen queen = new Queen(4, 4, Color.WHITE);

    // Test valid movements
    assertTrue(queen.canMove(4, 1));  // Horizontal movement
    assertTrue(queen.canMove(1, 4));  // Vertical movement
    assertTrue(queen.canMove(2, 2));  // Diagonal movement
    assertTrue(queen.canMove(6, 6));  // Diagonal movement

    // Test invalid movements
    assertFalse(queen.canMove(2, 3));
    assertFalse(queen.canMove(5, 1));
    assertFalse(queen.canMove(3, 6));
    assertFalse(queen.canMove(7, 4));
  }

  @Test
  public void testCanKill() {
    Queen queen = new Queen(3, 3, Color.BLACK);

    // Test valid killing moves
    assertTrue(queen.canKill(new Rook(3, 6, Color.WHITE)));
    assertTrue(queen.canKill(new Bishop(1, 3, Color.WHITE)));
    assertTrue(queen.canKill(new Pawn(6, 3, Color.WHITE)));
    assertTrue(queen.canKill(new Queen(6, 6, Color.WHITE)));

    // Test invalid killing moves
    assertFalse(queen.canKill(new Rook(5, 5, Color.BLACK)));
    assertFalse(queen.canKill(new Bishop(4, 2, Color.BLACK)));
    assertFalse(queen.canKill(new Pawn(3, 6, Color.BLACK)));
    assertFalse(queen.canKill(new Queen(1, 3, Color.BLACK)));
  }
}