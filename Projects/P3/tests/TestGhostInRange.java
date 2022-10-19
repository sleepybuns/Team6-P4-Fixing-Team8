import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    PacMan p = frame.addPacMan(new Location(6, 4));
    assertFalse(p.is_ghost_in_range());
    //Ghost g = frame.addGhost(new Location(6,3), "Pinky", Color.pink);

    //assertTrue(p.is_ghost_in_range()==true);
  }
}
