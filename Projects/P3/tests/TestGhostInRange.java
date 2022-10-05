import java.io.*;
import junit.framework.*;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    Frame frame = new MainFrame();

    PacMan p = frame.addPacMan(new Location(6,4));
    Ghost g = frame.addGhost(new Location(6,3), "Pinky", Color.pink);

    assertTrue(p.is_ghost_in_range()==True);
  }
}
