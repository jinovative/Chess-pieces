import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Testing for the Rook class.
 */
public class RookTest {

  @Test(expected = IllegalArgumentException.class)
  public void testNegativeValue() {
    new Rook(-1, 0, Color.BLACK);
  }

  @Test
  public void testCanMove() {
    Rook rook = new Rook(4, 4, Color.WHITE);

    // Test valid movements
    assertTrue(rook.canMove(4, 1));  // Horizontal movement
    assertTrue(rook.canMove(1, 4));  // Vertical movement

    // Test invalid movements
    assertFalse(rook.canMove(2, 3));
    assertFalse(rook.canMove(5, 1));
    assertFalse(rook.canMove(3, 6));
    assertFalse(rook.canMove(7, 4));
  }

  @Test
  public void testCanKill() {
    Rook rook = new Rook(3, 3, Color.BLACK);

    // Test valid killing moves
    assertTrue(rook.canKill(new Bishop(3, 6, Color.WHITE)));
    assertTrue(rook.canKill(new Queen(1, 3, Color.WHITE)));

    // Test invalid killing moves
    assertFalse(rook.canKill(new Bishop(4, 2, Color.BLACK)));
    assertFalse(rook.canKill(new Pawn(3, 6, Color.BLACK)));
    assertFalse(rook.canKill(new Queen(1, 4, Color.BLACK)));
  }
}