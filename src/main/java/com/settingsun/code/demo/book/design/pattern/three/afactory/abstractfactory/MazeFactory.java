package com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory;

import com.settingsun.code.demo.book.design.pattern.three.afactory.Maze;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public abstract class MazeFactory {
    public abstract Maze makeMaze(int h, int w);
    public abstract Room makeRoom(int id);
    public abstract Door makeDoor(Room a, Room b, boolean isOpen);
}
