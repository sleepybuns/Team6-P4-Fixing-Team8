import java.io.*;
import junit.framework.*;
import org.junit.Test;


public class TestPacManMove extends TestCase {
  
  @Test
  public void testPacManMove() throws FileNotFoundException {
    Mainframe map = new Mainframe();
    //PacMan obj = new PacMan();
    Pacman pacman = frame.addPacMan(new Location(9, 11), "Jessy", Color.green);
    
    assertEquals(pacman.move(new Location(1,3)), true);

  }
}
