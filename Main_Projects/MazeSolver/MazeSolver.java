/**
 * @author Victor Daniel Arellana Assia
 * Date: 07/17/2026
 * Course: CS 1027
 * Assignment 3 - Maze Solver
 */

import java.util.ArrayList;

public class MazeSolver {

    public static boolean solveMaze(char[][] maze, int row, int col, ArrayList<String> path, MazeVisualizer visualizer) {

        // Check for out of bounds for positioning
        if(row < 0 || row >= maze.length || col < 0 || col >= maze[0].length) {
            return false; 
        }
       // Check if the current position is a wall or already visited
        if(maze[row][col] == '#' || maze[row][col] == '+'){
            return false;
        }

        //Check if Exit found
        if(maze[row][col] == 'E') {
            return true; 
        }

        char position = maze[row][col];
        maze[row][col] = '+'; // Mark the current position as visited
        visualizer.repaint();
        try{
            Thread.sleep(100); // Pause for 100 milliseconds to visualize the step
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Check all four possible directions (down, right, up, left) recursively
        if(solveMaze(maze, row + 1, col, path, visualizer)) { 
            path.add("down");
            return true;
        }
        
        if(solveMaze(maze, row, col + 1, path, visualizer)) { 
            path.add("right");
            return true;
        }

        if(solveMaze(maze, row - 1, col, path, visualizer)) { 
            path.add("up");
            return true;
        }

        if(solveMaze(maze, row, col - 1, path, visualizer)) { 
            path.add("left");
            return true;
        }

        maze[row][col] = position; // Unmark the current position (backtrack)
        visualizer.repaint();
        try{
            Thread.sleep(100); // Pause for 100 milliseconds to visualize the step
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return false; // No valid path found from current position
    }

    public static void main(String[] args) {
        Maze maze = new Maze("maze5.txt"); // to change the maze you're solving, change this filename (maze1.txt, maze2.txt, maze3.txt, maze4.txt, or maze5.txt)
        maze.printMaze();

        ArrayList<String> path = new ArrayList<>();

        // create a frame to display the maze
        MazeVisualizer visualizer = new MazeVisualizer(maze.getMaze(), path);
        visualizer.display();

        if (solveMaze(maze.getMaze(), maze.getStartRow(), maze.getStartCol(), path, visualizer)) {
            System.out.println("Maze solved:");
            for (int i = path.size() - 1; i >= 0; i--) {
                System.out.println(path.get(i));
            }
        } else {
            System.out.println("No solution found for the maze.");
        }
    }
}
