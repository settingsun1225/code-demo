package com.settingsun.code.demo.book.design.pattern.three.afactory.basic;

import com.settingsun.code.demo.book.design.pattern.three.afactory.core.Directory;
import com.settingsun.code.demo.book.design.pattern.three.afactory.core.MazePrint;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class run {
    public static void main(String[] args) {
        int h = 2;
        int w = 2;
        Maze maze = new Maze(h, w);
        Room a = new Room(1);
        Room b = new Room(2);
        Room c = new Room(3);
        Room d = new Room(4);
        Door doorab = new Door(a, b, true);
        Door doorac = new Door(a, c, false);
        a.setSite(Directory.EAST, doorab);
        b.setSite(Directory.WEST, doorab);
        a.setSite(Directory.SOURTH, doorac);
        c.setSite(Directory.NORTH, doorac);
        maze.addRoom(0, 0, a);
        maze.addRoom(0, 1, b);
        maze.addRoom(1, 0, c);
        maze.addRoom(1, 1, d);


        MazePrint.printMaze(maze);
    }
}
