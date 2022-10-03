# Project 3: PacMan
## Group Members
Jessy-Manuella Tientcheu, Darian Maitland, Samara Wondimu, Andrew Muirhead

## How to Run Code


## Pacman Class

### move(String name, Location loc, Type type) 
* Return type: boolean
* Description: The purpose of this method is to see where the PacMan can move relative to its current location. If a move is valid then Pacman can move and you return true. Otherwise, you return false.

### consume()
-
### is_ghost_in_range()
-

### get_valid_moves()



## Ghost Class

### get_valid_moves()
* Return type: ArrayList<Location>()
* Description: The purpose of this method is to the different locations a ghost can move relative to its current location. A ghost can only move up.

### move()
-
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
-
### getLoc(Location loc)
-
### attack(String name)
* Return type: boolean
* Description: The purpose of this method is to get the ghost to attack the pacman. If ghost is at the exact location of pacman, then ghost is able to attack the pacman and return true. If not, then return false.

### eatCookie(String name)
-
