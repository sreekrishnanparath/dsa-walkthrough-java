/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class RobotCleaner {

static Set<Item> set = new HashSet<>();
static int[] dir = new int[] {0,1,2,3}; // right, down, left, up

public static void main(String[] args) {
    char[][] board1 = new char[][]{
            {'.','.','.','.','X','.','.'},
            {'X','.','.','.','.','.','.'},
            {'.','.','.','.','.','X','.'},
            {'.','.','.','.','.','.','.'},
    };

    char[][] board = new char[][]{
            {'.','.','X','.','.'},
            {'X','.','.','.','.'},
            {'.','.','.','.','.'},
            {'.','.','.','.','.'},
    };
    
    String[] array = {"....X..","X......",".....X.","......."};

    System.out.println(solve(array));
}

public static int solve(String[] board) {
    Map<String,Boolean> visited = new HashMap<>();
    dfs(board , 0, 0, 0 , visited);
    return set.size();
}

static void dfs(String[] board, int x, int y, int direction, Map<String,Boolean> visited) {

    String key = x+":"+y+":"+direction;
    if(visited.containsKey(key)) {
        return;
    }

    if(x==board.length || x==-1 || y==-1 || y==board.length) {
        if (x == board.length) {
            dfs(board, x - 1, y, 2, visited);
        } else if (x == -1) {
            dfs(board, x + 1, y, 0, visited);
        } else if (y == board.length) {
            dfs(board, x, y - 1, 1, visited);
        } else if (y == -1) {
            dfs(board, x, y + 1, 3, visited);
        }
        return;
    }

    visited.put(key , true);
    if(board[0].charAt(y)!='X') {
        Item item = new Item(x,y);
        set.add(item);
        if(direction==0) {
            dfs(board , x, y+1 , 0, visited);
        }
        else if(direction==1) {
            dfs(board , x+1, y , 1, visited);
        }
        else if(direction==2) {
            dfs(board , x, y-1 , 2, visited);
        }
        else {
            dfs(board , x-1, y , 3, visited);
        }
    }
    else {
        if(direction==0) {
            dfs(board , x, y-1 , 1, visited);
        }
        else if(direction==1) {
            dfs(board , x-1, y , 2, visited);
        }
        else if(direction==2) {
            dfs(board , x, y+1 , 3, visited);
        }
        else {
            dfs(board , x+1, y , 0, visited);
        }
    }

}

}

class Item {
    int x;
    int y;
    Item(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashCode() {
        return Objects.hashCode(this.x)*Objects.hashCode(this.y);
    }

    public boolean equals(Object o) {
        Item other = (Item)o;
        return other.x==this.x && other.y==this.y;
    }
}

