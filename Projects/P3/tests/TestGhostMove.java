import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    //MainFrame frame = new MainFrame(); 
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9, 11), "Pinky", Color.pink);

    assertEquals(ghost.move(), true);
  }
}
