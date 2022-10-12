import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Ghost ghost = frame.addGhost(new Location(5, 2), "Pinky", Color.pink);
    PacMan pacman = frame.addPacMan(new Location(5,1));
    assertTrue(ghost.attack());
    }
}
