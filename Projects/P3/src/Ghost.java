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

    int random_move = 0 + (int)(Math.random() * ((2 - 0) + 1));

    Location new_loc = valid_moves.get(random_move);

    this.myLoc = new_loc;
    return true;
  }

  public boolean is_pacman_in_range() {
    //comment
    
    boolean inRange = false;

    if (myMap.getLoc(new Location(myLoc.x+1, myLoc.y+1)).contains(Map.Type.PACMAN)) {
      inRange = true;
    } else if (myMap.getLoc(new Location(myLoc.x, myLoc.y-1)).contains(Map.Type.PACMAN)) {
      inRange = true;
    } else if (myMap.getLoc(new Location(myLoc.x, myLoc.y+1)).contains(Map.Type.PACMAN)) {
      inRange = true;
    } else if (myMap.getLoc(new Location(myLoc.x-1, myLoc.y+1)).contains(Map.Type.PACMAN)) {
      inRange = true;
    } else if (myMap.getLoc(new Location(myLoc.x+1, myLoc.y-1)).contains(Map.Type.PACMAN)) {
      inRange = true;
    } else if (myMap.getLoc(new Location(myLoc.x+1, myLoc.y)).contains(Map.Type.PACMAN)) {
      inRange = true;
    } else if (myMap.getLoc(new Location(myLoc.x-1, myLoc.y+1)).contains(Map.Type.PACMAN)) {
      inRange = true;
    } else if (myMap.getLoc(new Location(myLoc.x-1, myLoc.y-1)).contains(Map.Type.PACMAN)) {
      inRange = true;
    }

    return inRange;
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