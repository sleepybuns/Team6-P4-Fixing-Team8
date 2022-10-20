import java.io.*;
import junit.framework.*;
import java.util.ArrayList;


public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized
    PacMan pacman = frame.addPacMan(new Location(9, 11));
    //ArrayList<Location> valid_moves = pacman.get_valid_moves();

    ArrayList<Location> expected = new ArrayList<Location>();
    expected.add(new Location(9, 10));
    expected.add(new Location(10, 11));
    expected.add(new Location(10, 12));

    assertTrue(expected.contains(new Location(9, 4)));
  }
}
