import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BishopTest {

  @Test
  public void testCanMove() {
    Bishop bishop = new Bishop(3, 3, Color.WHITE);

    // Test valid movements
    assertTrue(bishop.canMove(1, 1));
    assertTrue(bishop.canMove(5, 1));
    assertTrue(bishop.canMove(1, 5));
    assertTrue(bishop.canMove(5, 5));

    // Test invalid movements
    assertFalse(bishop.canMove(3, 4));
    assertFalse(bishop.canMove(3, 2));
    assertFalse(bishop.canMove(4, 3));
    assertFalse(bishop.canMove(2, 3));
  }

  @Test
  public void testCanKill() {
    Bishop bishop = new Bishop(2, 2, Color.BLACK);

    // Test valid killing moves
    assertTrue(bishop.canKill(new Rook(4, 4, Color.WHITE)));
    assertTrue(bishop.canKill(new Rook(4, 0, Color.WHITE)));
    assertTrue(bishop.canKill(new Rook(0, 0, Color.WHITE)));
    assertTrue(bishop.canKill(new Rook(0, 4, Color.WHITE)));

    // Test invalid killing moves
    assertFalse(bishop.canKill(new Rook(3, 3, Color.WHITE)));
    assertFalse(bishop.canKill(new Rook(1, 1, Color.WHITE)));
    assertFalse(bishop.canKill(new Rook(3, 1, Color.WHITE)));
    assertFalse(bishop.canKill(new Rook(1, 3, Color.WHITE)));
  }
}