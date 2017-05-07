package com.settingsun.code.demo.book.design.pattern.three.afactory;


import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 * 假设房间编号即位置
 */
public class Maze {
    private final int h;
    private final int w;
    private Room[][] rooms ;

    public Maze(int h, int w) {
        this.h = h;
        this.w = w;
        rooms = new Room[h][w];
    }

    public Maze addRoom(int h, int w, Room room) {
        rooms[h][w] = room;
        return this;
    }


    public Room getRoomByLocation(int h, int w) {
        return rooms[h][w];
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }
}
