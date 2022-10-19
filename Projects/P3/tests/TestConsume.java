import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
      //MainFrame frame = new MainFrame();
      NoFrame frame = new NoFrame();
      
      PacMan pacman = frame.addPacMan(new Location(4, 4));

      assertTrue(pacman.consume()==null);
  }
}
