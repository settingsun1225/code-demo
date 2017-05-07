package com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory;

import com.settingsun.code.demo.book.design.pattern.three.afactory.Maze;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Room;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.magic.MagicRoom;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MagicMazeFactory extends MazeFactory {
    @Override
    public Maze makeMaze(int h, int w) {
        return new Maze(h, w);
    }

    @Override
    public Room makeRoom(int id) {
        return new MagicRoom(id, roomCastSpell());
    }

    @Override
    public Door makeDoor(Room a, Room b, boolean needSpell) {
        return new Door(a, b, !needSpell);
    }

    public String roomCastSpell() {
        return "asdfasdf";
    }
}
