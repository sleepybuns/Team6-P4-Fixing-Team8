import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {

   if(get_valid_moves().size() > 0) { 
   return true;

 } else {
   return false;
 }
}


  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}


