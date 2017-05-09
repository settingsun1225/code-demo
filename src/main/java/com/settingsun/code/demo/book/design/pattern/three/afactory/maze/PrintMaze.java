package com.settingsun.code.demo.book.design.pattern.three.afactory.maze;

/**
 * Created by settingsun1225 on 17/5/9.
 */
public class PrintMaze {

    public static void printMaze(Maze maze) {
        for (int h = 0; h < maze.getHeight(); h++) {
            for (int w = 0; w < maze.getWeight(); w++) {
                System.out.print(maze.getSite(h, w).view());
            }
            System.out.println();
        }
    }
}
