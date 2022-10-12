import java.io.*;
//import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); 
    Ghost ghost = frame.addGhost(new Location(9, 11));

    assertEquals(ghost.move(new Location(2, 4)), true);
  }
}
