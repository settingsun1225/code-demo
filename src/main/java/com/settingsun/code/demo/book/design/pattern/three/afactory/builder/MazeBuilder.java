package com.settingsun.code.demo.book.design.pattern.three.afactory.builder;

import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.Maze;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public interface MazeBuilder {
    void buildMaze(int h, int w);
    void buildRoom(int id);
    void buildDoor(int aid, int bid, boolean isOpen);

    Maze getMaze();
}
