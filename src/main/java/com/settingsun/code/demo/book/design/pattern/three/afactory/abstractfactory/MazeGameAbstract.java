package com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory;

import com.settingsun.code.demo.book.design.pattern.three.afactory.Maze;
import com.settingsun.code.demo.book.design.pattern.three.afactory.MazePrint;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.Directory;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MazeGameAbstract {

    public static void main(String[] args) {
        MagicMazeFactory factory = new MagicMazeFactory();
        createMaze(factory);
    }

    private static void createMaze(MazeFactory mazeFactory) {
        int h = 2, w = 2;
        Maze maze  = mazeFactory.makeMaze(h, w);
        Room a = mazeFactory.makeRoom(1);
        Room b = mazeFactory.makeRoom(2);
        Room c = mazeFactory.makeRoom(3);
        Room d = mazeFactory.makeRoom(4);
        Door doorab = mazeFactory.makeDoor(a, b, true);
        Door doorac = mazeFactory.makeDoor(a, c, false);
        a.setSite(Directory.EAST, doorab);
        b.setSite(Directory.WEST, doorab);
        a.setSite(Directory.SOURTH, doorac);
        c.setSite(Directory.NORTH, doorac);
        maze.addRoom(0,0,a);
        maze.addRoom(0,1,b);
        maze.addRoom(1,0,c);
        maze.addRoom(1,1,d);
        MazePrint.printMaze(maze);
    }
}
