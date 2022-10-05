import java.io.*;
import junit.framework.*;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    PacMan pacman = frame.addPacMan(new Location(9, 11));

    assertEquals(map.move("pacman", new Location (2,4), Map.Type.PACMAN), true);

    Ghost ghost = frame.addGhost(new Location(2, 4), "name", Color.red);

    assertEquals(map.move("pacman", new Location (2,4), Map.Type.PACMAN), false);
  }
}
