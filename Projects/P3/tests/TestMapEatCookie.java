import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    MainFrame frame = new MainFrame();

    PacMan p = frame.addPacMan(new Location(4,4));
    CookieComponent c = new CookieComponent(4,4,1);

    assertTrue(frame.getMap().eatCookie("4,4") != null);
  }
}
