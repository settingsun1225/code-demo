package com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory;

import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.Maze;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public interface MazeFactory {
    Maze makeMaze(int h, int w);
    Room makeRoom(int id);
    Door makeDoor(Room a, Room b, boolean isOpen);
}
