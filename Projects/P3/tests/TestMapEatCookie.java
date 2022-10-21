import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    PacMan pacman = frame.addPacMan(new Location(4, 4));
    Ghost g = frame.addGhost(new Location(4, 5),"pacman", Color.white);
    CookieComponent c = new CookieComponent(4,4,1);

    assertTrue(frame.getMap().eatCookie("pacman") == null);
  }
}
