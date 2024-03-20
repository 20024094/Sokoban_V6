package sokoban_v6;

/**
 *
 * @author danie
 */
public class Map {
    
    private MapElement[][] myMap = new MapElement[12][12];
    int playerRow = 4;
    int playerCol = 5;
    
    public Map() {
       for (int i = 0; i < myMap.length; i++) {
           for (int j = 0; j < myMap.length; j++) {
               myMap[i][j] = new Floor();
           }
       }
       myMap[playerRow][playerCol] = new Player();
    }
    
    public MapElement[][] getMyMap() {
        return myMap;
    }
    
    public void movePlayer(int dir) {
    // Up
    if (dir == 1) {
       myMap[playerRow][playerCol] = new Floor();
       myMap[--playerRow][playerCol] = new Player();
    } 
    // Down
    else if (dir == 2) {
       myMap[playerRow][playerCol] = new Floor();
       myMap[++playerRow][playerCol] = new Player(); 
    }
    // Left
    else if (dir == 3) {
       myMap[playerRow][playerCol] = new Floor();
       myMap[playerRow][--playerCol] = new Player();
    } 
    // Right
    else if (dir == 4) {
       myMap[playerRow][playerCol] = new Floor();
       myMap[playerRow][++playerCol] = new Player();
    }
}
    
}
