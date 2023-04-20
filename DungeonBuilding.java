/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonbuilding;

/**
 *
 * @author 139673
 */
import java.util.*;

public class DungeonBuilding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int n = in.nextInt();
        
        char[][] dungeon = new char[n*3][n*3];

        for (int i = 0; i < dungeon.length; i++) {
            for (int j = 0; j < dungeon[0].length; j++) {
                dungeon[i][j] = '#';
            }
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {  
                int t = in.nextInt();
                
                if (t == 0) {
                    int x = 1 + (3 * i);
                    int y = 1 + (3 * j);
                    dungeon[x][y] = '.';
                    
                    if ((x - 3) > 0 && dungeon[x - 3][y] == '.') {
                        dungeon[x - 2][y] = '.';
                        dungeon[x - 1][y] = '.';
                    } 
                    
                    if ((x + 3) < dungeon.length && dungeon[x + 3][y] == '.') {
                        dungeon[x + 2][y] = '.';
                        dungeon[x + 1][y] = '.';
                    } 
                    
                    if ((y - 3) > 0 && dungeon[x][y - 3] == '.') {
                        dungeon[x][y - 2] = '.';
                        dungeon[x][y - 1] = '.';
                    } 

                }
            }
        }

        
        for (int i = 0; i < dungeon.length; i++) {
            for (int j = 0; j < dungeon[0].length; j++) {
                System.out.print(dungeon[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
