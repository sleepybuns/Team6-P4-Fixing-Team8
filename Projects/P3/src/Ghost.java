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
    ArrayList<Location> valid_moves = this.get_valid_moves();

    if(valid_moves.size() == 0) {
      return false;
    }

    Location new_loc = valid_moves.get(0);

    this.myLoc = new_loc;
    return true;
  }

  public boolean is_pacman_in_range() {
    //comment
    Location up, down, left, right;

    up = new Location(myLoc.x, myLoc.y - 1);
    down = new Location(myLoc.x, myLoc.y + 1);
    left = new Location(myLoc.x-1, myLoc.y);
    right = new Location(myLoc.x+1, myLoc.y);

     if(myMap.getLoc(up) != null){
      if(myMap.getLoc(up).contains(Map.Type.PACMAN)){
        return true;
      }
    }
    if(myMap.getLoc(down) != null){
      if(myMap.getLoc(down).contains(Map.Type.PACMAN)){
        return true;
      }
    }
    if(myMap.getLoc(left) != null){
      if(myMap.getLoc(left).contains(Map.Type.PACMAN)){
        return true;
      }
    }
    if(myMap.getLoc(right) != null){
      if(myMap.getLoc(right).contains(Map.Type.PACMAN)){
        return true;
      }
    }
    return false;
  }

  public boolean attack() {
    if(is_pacman_in_range() == true ) {
      if(myMap.attack("pacman")==true) {
        return true;
      }
      return false;
    } else {
      return false;
    }
  }
}