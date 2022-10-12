import java.io.*;
import junit.framework.*;



public class TestPacManMove extends TestCase {
  

  public void testPacManMove() throws FileNotFoundException {
    MainFrame map = new MainFrame();
    NoFrame frame = new NoFrame();
    //PacMan obj = new PacMan();
    PacMan pacman = frame.addPacMan(new Location(9, 11));

    assertTrue(pacman.move());

    Location newLoc = new Location(1,3);
    

    assertTrue(pacman.myLoc.equals(newLoc));
    

  }
}
