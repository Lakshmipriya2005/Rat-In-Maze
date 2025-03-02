# Rat in a Maze
The Rat in a Maze is a classic backtracking algorithm problem where the objective is to find a path for a rat to travel from the top-left corner to the bottom-right corner of a maze. The maze is represented as a 2D grid, with open paths and blocked cells. The rat can only move in four possible directions: up, down, left, and right.

### Problem Description:
Given a maze with open paths (represented as 1s) and blocked paths (represented as 0s), the rat needs to find a path from the start (top-left) to the destination (bottom-right). The rat can only move to adjacent cells that are open and cannot pass through blocked cells. The task is to find one or more valid paths using a backtracking approach.

### Algorithm:
The solution uses a backtracking approach to explore possible paths recursively.
If the rat encounters a blocked cell or reaches a dead-end, it backtracks and tries a different path.
The maze is traversed row by row, and at each step, the current path is marked until the destination is reached or all possibilities are exhausted.

### Features:
Recursive Backtracking: The solution employs a recursive function to explore each possible move, backtracking when a dead-end is encountered.
Pathfinding: The algorithm checks all directions (up, down, left, right) to find valid paths while ensuring no revisits to previously visited cells.
Output: Displays all possible valid paths from the start to the destination, or indicates if no path exists.

### How to Run:
Clone the repository.
Run the program with a maze as input (as a 2D matrix).
The solution will print all the valid paths or show that no path exists.
Usage Example:

maze = {
	 {1, 1, 1},
	 {1, 0, 9},
	 {1, 1, 1}
      };
        

// Function call to solve the maze
Maze(maze)
### Technologies Used:
Programming Language: Python/Java/C++ (adjust based on your implementation)
Problem Solving: Backtracking, Recursion

### Output 
![image](https://github.com/user-attachments/assets/8bf272ed-6dc4-4e45-a507-841610e275c0)


### Conclusion:
This README description provides a brief overview of the Rat in a Maze problem, explains the algorithm used, and includes instructions for running the program. It’s designed to be easy to understand for anyone browsing your GitHub repository.
