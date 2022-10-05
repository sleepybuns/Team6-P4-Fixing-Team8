import java.io.*;
import junit.framework.*;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    // test for map get loc by andrew
    
    HashSet<Type> result = new HashSet<Type>();
    result.add(Map.Type.GHOST);
    result.add(Map.Type.PACMAN);

    
    Mainframe frame = new MainFrame();
    NoFrame frame = new NoFrame();

    Ghost ghost = frame.addGhost(new Location(4, 4), "coolghost", Color.red);
    PacMan pacman = frame.addPacMan(new Location(4, 4));

    assertEqual(map.getLoc(new Location(4,4)), result);


  }
}
