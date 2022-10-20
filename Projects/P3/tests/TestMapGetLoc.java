import java.io.*;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.HashSet;
import java.awt.Color;

import junit.framework.*;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    // test for map get loc by andrew
    
    HashSet<Map.Type> result = new HashSet<Map.Type>();
    result.add(Map.Type.GHOST);
    result.add(Map.Type.PACMAN);

    
    //MainFrame frame = new MainFrame();
    NoFrame frame = new NoFrame();

    Ghost ghost = frame.addGhost(new Location(4, 4), "coolghost", Color.red);
    PacMan pacman = frame.addPacMan(new Location(4, 4));

    assertFalse(frame.getMap().getLoc(new Location(4,4)).contains(Map.Type.PACMAN));


  }
}
