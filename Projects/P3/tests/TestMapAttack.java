import junit.framework.*;
import org.junit.Test;



public class TestMapAttack extends TestCase {
  @Test
  public void testMapAttack() throws FileNotFoundException {
    Mainframe map = new Mainframe();
    Pacman pacman = frame.addPacMan(new Location(9, 11), "Jessy", Color.green);
    Ghost ghost = frame.addGhost(new Location(9, 11), "Jessy", Color.green);
    
    assertTrue(ghost.attack());
  }
}
