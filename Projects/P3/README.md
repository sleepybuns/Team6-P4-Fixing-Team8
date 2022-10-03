# Project 3: PacMan
## Group Members
Jessy-Manuella Tientcheu, Darian Maitland, Samara Wondimu, Andrew Muirhead

## Demo

## How to Run Code
```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## Pacman Class

### move(String name, Location loc, Type type) 
* Return type: boolean
* Description: The purpose of this method is to see where the PacMan can move relative to its current location. If a move is valid then Pacman can move and you return true. Otherwise, you return false.

### consume()
-
### is_ghost_in_range()
-

### get_valid_moves()
- this method returns an array of all the valid moves that the pacman can take by taking the current location and either incrementing the y-coordinate(upward), the x-coordinate (to the right), or both the x and y coordinates (diagonally forward).
- to test I chose a random location to set my test pacman. Then, I checked to see if the resulting coordinates of pacman.get_valid_moves() gave me the expected result.


## Ghost Class

### get_valid_moves()
* Return type: ArrayList<Location>()
* Description: The purpose of this method is to the different locations a ghost can move relative to its current location. A ghost can only move up.

### move()
- this function uses the results of the valid move function and then chooses one location randomly to move the character using Math.random.
### is_pacman_in_range()
* Return type: `boolean`
* Description: This method supplements the `Ghost.attack()` method, checking the Ghost's surroundings for Pacman. If Pacman is within the attack radius (x±1,y±1) of Ghost then the method returns true, otherwise the method returns false. 
* Examples:
    ```java
    //ghost at location (5,3)
    
    //pacman at location (6,4)
    ghost.is_pacman_in_range() -> true
    
    //pacman at location (7,2)
    ghost.is_pacman_in_range() -> false
    
  ```
### attack()

  
## Map Class

### move(String name, Location loc, Type type)
- this function moves the object specified into the location specified by updating all the places where the location of that specific object is stored/accessed.
### getLoc(Location loc)
-
### attack(String name)
* Return type: boolean
* Description: The purpose of this method is to get the ghost to attack the pacman. If ghost is at the exact location of pacman, then ghost is able to attack the pacman and return true. If not, then return false.

### eatCookie(String name)
-
