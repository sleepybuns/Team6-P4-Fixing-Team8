import java.io.*;
import java.util.ArrayList;
import java.awt.Color;

import junit.framework.*;



public class TestGhostValidMoves extends TestCase {
  
  public void testGhostValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9, 11), "Jessy", Color.GREEN);
    ArrayList<Location> valid_moves = ghost.get_valid_moves();

    ArrayList<Location> expectedMoves = new ArrayList<Location>();
    expectedMoves.add(new Location(9, 12));
    expectedMoves.add(new Location(10, 11));
    expectedMoves.add(new Location(10, 12));

    assertTrue(ghost.get_valid_moves().equals(expectedMoves));
  }
}
