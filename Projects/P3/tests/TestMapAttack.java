import junit.framework.*;
import java.awt.Color;
import java.io.FileNotFoundException;



public class TestMapAttack extends TestCase {
  
  public void testMapAttack() throws FileNotFoundException {
   
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9, 11), "Jessy", Color.GREEN);
    
    assertTrue(ghost.attack());
  }

}
