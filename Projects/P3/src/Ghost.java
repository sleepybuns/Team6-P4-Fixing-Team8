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
    return null;
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
    return false;
  }

  public boolean attack() {
    return false;
  }
}
