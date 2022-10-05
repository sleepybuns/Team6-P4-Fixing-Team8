import java.io.*;
import junit.framework.*;

public class TestPacManInRange extends TestCase {
  
  @Test
  public void testPacManInRange() throws FileNotFoundException {
    Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    Ghost ghost = frame.addGhost(new Location(5, 5), "coolghost", Color.green)
    PacMan pacman = frame.addPacMan(new Location(6, 6));

    assertTrue(ghost.is_pacman_in_range());
  }
}
