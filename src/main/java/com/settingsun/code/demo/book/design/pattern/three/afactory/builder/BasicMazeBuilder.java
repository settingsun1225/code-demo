package com.settingsun.code.demo.book.design.pattern.three.afactory.builder;

import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.Maze;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Room;
import com.settingsun.code.demo.book.design.pattern.three.afactory.core.Directory;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class BasicMazeBuilder implements MazeBuilder {
    private Maze maze;
    @Override
    public void buildMaze(int h, int w) {
        maze = new Maze(2, 2);
    }

    @Override
    public void buildRoom(int id) {
        Location location = convert(id);
        Room room = new Room(id);
        maze.addRoom(location.h, location.w, room);
    }

    private class Location {
        public int h;
        public int w;
    }

    public Location convert(int id) {
        Location location = new Location();
        location.h = (id - 1) / maze.getH();
        location.w = id - location.h * maze.getW() - 1;
        return location;
    }

    @Override
    public void buildDoor(int aid, int bid, boolean isOpen) {
        Location al = convert(aid);
        Location bl = convert(bid);
        Directory ad, bd;
        if (bl.h == al.h) {
            if (al.w == (bl.w - 1)) {
                ad = Directory.EAST;
                bd = Directory.WEST;
            } else if (al.w == (bl.w + 1)) {
                ad = Directory.WEST;
                bd = Directory.EAST;
            } else {
                return;
            }
        } else if (al.w == bl.w) {
            if (al.h == (bl.h + 1)) {
                ad = Directory.NORTH;
                bd = Directory.SOURTH;
            } else if (al.h == (bl.h - 1)) {
                ad = Directory.SOURTH;
                bd = Directory.NORTH;
            } else {
                return;
            }
        } else {
            return;
        }
        Room a = maze.getRoomByLocation(al.h, al.w);
        Room b = maze.getRoomByLocation(bl.h, bl.w);
        Door door = new Door(a, b, isOpen);
        a.setSite(ad, door);
        b.setSite(bd, door);
    }

    @Override
    public Maze getMaze() {
        return maze;
    }
}
