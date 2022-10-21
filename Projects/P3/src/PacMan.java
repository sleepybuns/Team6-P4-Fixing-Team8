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

   if(get_valid_moves().size() > 0) { 
   return true;

 } else {
   return false;
 }
}

  public boolean is_ghost_in_range() {/*for example, if pacmans location is (6,4)*/
    Location up, down, left, right;
    up = new Location(myLoc.x, myLoc.y - 1);/*(6,3)*/
    down = new Location(myLoc.x, myLoc.y + 1);/*(6,5)*/
    left = new Location(myLoc.x-1, myLoc.y);/*(5,4)*/
    right = new Location(myLoc.x+1, myLoc.y);/*(7,4)*/
    
    if(myMap.getLoc(up) != null){
      if(myMap.getLoc(up).contains(Map.Type.COOKIE)){
        return false;
      }
    }
    if(myMap.getLoc(down) != null){
      if(myMap.getLoc(down).contains(Map.Type.COOKIE)){
        return false;
      }
    }
    if(myMap.getLoc(left) != null){
      if(myMap.getLoc(left).contains(Map.Type.COOKIE)){
        return false;
      }
    }
    if(myMap.getLoc(right) != null){
      if(myMap.getLoc(right).contains(Map.Type.COOKIE)){
        return false;
      }
    }
    return true;
  }

  public JComponent consume() {
    if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE)) {
        return myMap.eatCookie(myName);
    } 
    return null;
  }
}


