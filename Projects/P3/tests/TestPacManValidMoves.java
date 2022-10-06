import java.io.*;
import junit.framework.*;
import java.util.ArrayList;
import javax.tools.DocumentationTool.Location;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    PacMan pacman = frame.addPacMan(new Location(9, 11));
    valid_moves = pacman.getValidMoves();

    ArrayList<Location> expected = new ArrayList<Location>();
    expected.add(new Location(9, 12));
    expected.add(new Location(10, 11));
    expected.add(new Location(10, 12));

    assertEquals(valid_moves, expected);
  }
}
