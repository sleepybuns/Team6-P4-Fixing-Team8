import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized
    PacMan pacman = frame.addPacMan(new Location(9, 11));
    

    assertTrue(frame.getMap().move("pacman", new Location (2,4), Map.Type.PACMAN));

    Ghost ghost = frame.addGhost(new Location(2, 4), "name", Color.red);

    assertFalse(frame.getMap().move("pacman", new Location (2,6), Map.Type.GHOST));
  }
}
