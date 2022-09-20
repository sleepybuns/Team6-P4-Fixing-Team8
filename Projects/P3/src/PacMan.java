import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  // comment

  
  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    ArrayList<Location> valid_moves = new ArrayList<Location>();
    valid_moves.add(new Location(myLoc.x + 1, myLoc.y + 1));
    valid_moves.add(new Location(myLoc.x + 1, myLoc.y));
    valid_moves.add(new Location(myLoc.x, myLoc.y + 1));
    return valid_moves;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
