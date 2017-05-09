package com.settingsun.code.demo.book.design.pattern.three.afactory.maze;

/**
 * Created by settingsun1225 on 17/5/9.
 */
public class run {

    public static void main(String[] args) {
        int height = 3, weight = 3;
        Maze maze = runBasic(height, weight);
        PrintMaze.printMaze(maze);
    }
    private static Maze runBasic(int height, int weight) {
        Maze maze = new Maze(height, weight);
        maze.add(0, 2, new Room(1));
        maze.add(1, 2, new Room(2));
        maze.add(1, 1, new Door(Door.Directory.LEFT_RIGHT));
        maze.add(1, 0, new Room(4));
        return maze;
    }

    private static Maze runFactory(int height, int weight) {
        Maze maze = new Maze(height, weight);
        int curId = 1;
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < weight; w++) {
                MapSite mapSite = MapSiteFactory.getSite(curId);
                maze.add(h, w, mapSite);
            }
        }
        return maze;
    }
}
