import java.io.*;
import junit.framework.*;
import org.junit.Test;


public class TestGhostValidMoves extends TestCase {
  @Test
  public void testGhostValidMoves() throws FileNotFoundException {
    Ghost obj = new Ghost();
    Ghost ghost = frame.addGhost(new Location(9, 11), "Jessy", Color.green);
    valid_moves = ghost.validMoves();

    ArrayList<Location> expectedMoves = new ArrayList<Location>();
    expectedMoves.add(new Location(9, 12));
    expectedMoves.add(new Location(10, 11));
    expectedMoves.add(new Location(10, 12));

    assertEquals(valid_moves, expectedMoves);
  }
}
