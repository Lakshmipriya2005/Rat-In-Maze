package ackTracking;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
	static int minPath=Integer.MAX_VALUE;
	 public static void maze(int[][] mat, int[][] vis, int row, int col, String st, List<String> str,int cnt) {
	        // Check if the current position is out of bounds, already visited, or blocked
	        if (row < 0 || row >= mat.length || col < 0 || col >= mat.length || vis[row][col] != 0 || mat[row][col] == 0) {
	            return;
	        }

	        // Check if we have reached the destination (bottom-right corner)
	        if (mat[row][col]==9) {
	            // Add the current path to the list of paths
	            str.add(st);
	            vis[row][col]=cnt;
	            minPath=Math.min(minPath, cnt);
	            for(int i=0;i<3;i++) {
	            	for(int j=0;j<3;j++) {
	            		System.out.print(vis[i][j]+"  ");
	            	}
	            	System.out.println();
	            }
	            //System.out.println();
	            
	            System.out.println(st+"\n");
	            vis[row][col]=0;
	            return;
	        }

	        // Mark the current cell as visited
	        vis[row][col] = cnt;

	        // Explore all four directions (Right, Down, Left, Up)

	        // Right
	        maze(mat, vis, row, col + 1, st + "R", str,cnt+1);

	        // Down
	        maze(mat, vis, row + 1, col, st + "D", str,cnt+1);

	        // Left
	        maze(mat, vis, row, col - 1, st + "L", str,cnt+1);

	        // Up
	        maze(mat, vis, row - 1, col, st + "U", str,cnt+1);

	        // Backtrack: unmark the current cell as visited
	        vis[row][col] = 0;
	    }

	    public static void main(String[] args) {
	        int[][] mat = {
	            {1, 1, 0},
	            {1, 0, 9},
	            {1, 1, 1}
	        };

	        int[][] vis = {
	            {0, 0, 0},
	            {0, 0, 0},
	            {0, 0, 0}
	        };
	        
	        List<String> str = new ArrayList<>();
	        // Start solving the maze from the top-left corner (0, 0)
	        maze(mat, vis, 0, 0, "", str,1);

	        // Print the paths and the number of ways to reach the destination
	        System.out.println("Paths: " + str);
	        System.out.println("Number of ways to reach the destination: " + str.size());
	        System.out.println("Minimum Path to Reach the Destination:"+(minPath-1));
	    }

}
