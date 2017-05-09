package com.settingsun.code.demo.book.design.pattern.three.afactory.builder;

import com.settingsun.code.demo.book.design.pattern.three.afactory.core.MazePrint;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class run {
    public static void main(String[] args) {
        MazeBuilder builder = new BasicMazeBuilder();
        build(builder);
    }

    private static void build(MazeBuilder builder) {
        builder.buildMaze(2, 2);
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildRoom(3);
        builder.buildRoom(4);
        builder.buildDoor(1, 2, true);
        builder.buildDoor(1, 3, false);

        MazePrint.printMaze(builder.getMaze());
    }
}
