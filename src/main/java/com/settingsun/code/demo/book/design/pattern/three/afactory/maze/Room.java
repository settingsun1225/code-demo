package com.settingsun.code.demo.book.design.pattern.three.afactory.maze;

/**
 * Created by settingsun1225 on 17/5/9.
 */
public class Room implements MapSite {
    private int id;
    public Room(int id) {
        this.id = id;
    }

    @Override
    public String view() {
        return "R" + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
