import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    PacMan pacman = frame.addPacMan(new Location(9, 11));
    

    assertEquals(frame.getMap().move("pacman", new Location (2,4), Map.Type.PACMAN), true);

    Ghost ghost = frame.addGhost(new Location(2, 4), "name", Color.red);

    assertEquals(frame.getMap().move("pacman", new Location (2,4), Map.Type.PACMAN), false);
  }
}
