import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    MainFrame frame = new MainFrame();

    PacMan p = frame.addPacMan(new Location(6,4));
    Ghost g = frame.addGhost(new Location(6,3), "Pinky", Color.pink);

    assertTrue(p.is_ghost_in_range()==true);
  }
}
