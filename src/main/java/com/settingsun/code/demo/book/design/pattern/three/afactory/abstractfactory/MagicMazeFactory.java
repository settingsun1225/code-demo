package com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory;

import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.Maze;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Room;
import com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory.site.MagicDoor;
import com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory.site.MagicRoom;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MagicMazeFactory implements MazeFactory {
    @Override
    public Maze makeMaze(int h, int w) {
        return new Maze(h, w);
    }

    @Override
    public Room makeRoom(int id) {
        return new MagicRoom(id, roomCastSpell());
    }

    @Override
    public Door makeDoor(Room a, Room b, boolean isOpen) {
        return new MagicDoor(a, b, isOpen);
    }

    public String roomCastSpell() {
        return "asdfasdf";
    }
}
