import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Testing for the Knight class.
 */
public class KnightTest {

  @Test(expected = IllegalArgumentException.class)
  public void testNegativeValue() {
    new Knight(-1, 0, Color.BLACK);
  }

  @Test
  public void testCanMove() {
    Knight knight = new Knight(3, 3, Color.WHITE);

    // Test valid movements
    assertTrue(knight.canMove(1, 2));
    assertTrue(knight.canMove(2, 1));
    assertTrue(knight.canMove(1, 4));
    assertTrue(knight.canMove(2, 5));
    assertTrue(knight.canMove(4, 1));
    assertTrue(knight.canMove(5, 2));
    assertTrue(knight.canMove(4, 5));
    assertTrue(knight.canMove(5, 4));

    // Test invalid movements
    assertFalse(knight.canMove(2, 2));
    assertFalse(knight.canMove(3, 4));
    assertFalse(knight.canMove(4, 3));
    assertFalse(knight.canMove(3, 5));
    assertFalse(knight.canMove(1, 3));
    assertFalse(knight.canMove(5, 3));
    assertFalse(knight.canMove(3, 1));
    assertFalse(knight.canMove(3, 6));
  }

  @Test
  public void testCanKill() {
    Knight knight = new Knight(2, 2, Color.BLACK);

    // Test valid killing moves
    assertTrue(knight.canKill(new Pawn(4, 3, Color.WHITE)));
    assertTrue(knight.canKill(new Pawn(4, 1, Color.WHITE)));
    assertTrue(knight.canKill(new Pawn(1, 4, Color.WHITE)));
    assertTrue(knight.canKill(new Pawn(1, 0, Color.WHITE)));

    // Test invalid killing moves
    assertFalse(knight.canKill(new Pawn(3, 3, Color.WHITE)));
    assertFalse(knight.canKill(new Pawn(3, 1, Color.WHITE)));
    assertFalse(knight.canKill(new Pawn(1, 3, Color.WHITE)));
    assertFalse(knight.canKill(new Pawn(0, 2, Color.WHITE)));
  }
}