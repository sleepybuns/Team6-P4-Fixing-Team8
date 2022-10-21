import java.io.*;
import junit.framework.*;



public class TestPacManMove extends TestCase {
  

  public void testPacManMove() throws FileNotFoundException {
   //MainFrame map = new MainFrame();
    NoFrame frame = new NoFrame();
    //PacMan obj = new PacMan();
    PacMan pacman = frame.addPacMan(new Location(9, 11));

    pacman.move();

    Location newLoc = new Location(1,3);
    

    assertTrue(frame.getMap().getLoc(new Location(1, 3)).contains(Map.Type.PACMAN));
    

  }
}
