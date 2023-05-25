import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PawnTest {

  @Test
  public void testCanMove() {
    Pawn whitePawn = new Pawn(6, 4, Color.WHITE);
    Pawn blackPawn = new Pawn(1, 4, Color.BLACK);

    // Test valid movements
    assertTrue(whitePawn.canMove(5, 4));  // White pawn moves one row forward
    assertTrue(blackPawn.canMove(2, 4));  // Black pawn moves one row forward

    // Test invalid movements
    assertFalse(whitePawn.canMove(4, 4));
    assertFalse(blackPawn.canMove(3, 4));
    assertFalse(whitePawn.canMove(6, 3));
    assertFalse(blackPawn.canMove(1, 5));
  }

  @Test
  public void testCanKill() {
    Pawn whitePawn = new Pawn(3, 3, Color.WHITE);
    Pawn blackPawn = new Pawn(6, 6, Color.BLACK);

    // Test valid killing moves
    assertTrue(whitePawn.canKill(new Pawn(2, 4, Color.BLACK)));    // Diagonal capture by white pawn
    assertTrue(blackPawn.canKill(new Pawn(7, 5, Color.WHITE)));    // Diagonal capture by black pawn

    // Test invalid killing moves
    assertFalse(whitePawn.canKill(new Pawn(2, 5, Color.WHITE)));
    assertFalse(blackPawn.canKill(new Pawn(5, 6, Color.BLACK)));
    assertFalse(whitePawn.canKill(new Rook(3, 4, Color.BLACK)));
    assertFalse(blackPawn.canKill(new Bishop(6, 5, Color.WHITE)));
  }
}