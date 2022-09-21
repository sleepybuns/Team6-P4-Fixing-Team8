import java.util.ArrayList;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
   
    ArrayList<Location> moves = new ArrayList<Location>();

    for (int i = 0; i < myLoc.x; i++) {
      for (int j = 0; j < myLoc.y; j++) {  
      }
    }
    moves.add(new Location(myLoc.x + 1, myLoc.y + 1));

    return moves;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}