package com.settingsun.code.demo.book.design.pattern.three.afactory.maze;

/**
 * Created by settingsun1225 on 17/5/9.
 */
public class Door implements MapSite {
    private Directory directory;

    public Door(Directory directory) {
        this.directory = directory;
    }
    @Override
    public String view() {
        if (directory == Directory.LEFT_RIGHT) {
            return "二";
        }
        return "||s";
    }

    public static enum Directory {
        LEFT_RIGHT,
        UP_DOWN;
    }
}
