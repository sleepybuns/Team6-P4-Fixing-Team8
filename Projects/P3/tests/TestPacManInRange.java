import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManInRange extends TestCase {
  
  
  public void testPacManInRange() throws FileNotFoundException {
    //andrew's tests
    
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized
    Ghost ghost = frame.addGhost(new Location(5, 5), "coolghost", Color.green);
    PacMan pacman = frame.addPacMan(new Location(6, 6));

    assertFalse(ghost.is_pacman_in_range());
  }
}
