import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  //private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    //this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location
   this.components.get(name).setLocation(loc.x, loc.y);
   this.locations.put(name, loc);
   if(!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
   field.get(loc).add(type);
   return true;
  }

  public HashSet<Type> getLoc(Location loc) {
    // wallSet and emptySet will help you write this method
    return field.get(loc);
  }

  public boolean attack(String name) {
    // update gameOver
    // ghost attack pacman 
    /*
     * First retrieve ghost  position based on the name 
     * Retrieve all pacman locations and check with the ghostlocation
     * if location match then  return true else false.  ghost.x = pacman.x and ghost.y=pacman.y 
     * need to know . How to retieve pacman locations and ghost locations.
     *  if the attack matters only when the x-axis match, take the ghost location and loop all teh
     * pacman where they have the same x-axisgit
     */
     
    if (field.get(locations.get(name)) != null) {
      // save this tempGhostLoc = locations.get(name)
      //if(tempGhostLoc.y<=12) conactYaxis = dim -  tempGhostLoc.y;
      // 12 -> 9, tempGhostLoc.y+conactYaxis -> 9,11->9,12
      HashSet<Map.Type> temp = field.get(locations.get(name));
      if(temp != null){
          if (temp.contains(Map.Type.PACMAN)){
            return true;
          }
      }
    }
    return false;
  }

  public JComponent eatCookie(String name) {
    if(name.equals("pacman") || name.equals("Pacman")){
      if(field.get(locations.get(name)).contains(Map.Type.COOKIE)){
        String cookieName = "tok_x" + locations.get(name).x + "_y" + locations.get(name).y;
        JComponent retVal = components.remove(cookieName);
        Location cookieLoc = locations.remove(cookieName);
        field.get(cookieLoc).remove(Type.COOKIE);
        cookies++;
        return retVal;
      }
    }
    return null;
  }
}
