import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
    Frame frame = new MainFrame();
    Ghost ghost = frame.addGhost(new Location(5, 2), "Pinky", Color.pink);
    Pacman pacman = frame.addPacMan(new Location(5,1));
    assertTrue(ghost.attack());
    }
}
