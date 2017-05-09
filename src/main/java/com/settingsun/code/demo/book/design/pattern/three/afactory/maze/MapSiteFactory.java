package com.settingsun.code.demo.book.design.pattern.three.afactory.maze;

import java.util.Random;

/**
 * Created by settingsun1225 on 17/5/9.
 */
public class MapSiteFactory {
    private static Random random = new Random();
    public static  MapSite getSite(int curRoomID) {
        int x = random.nextInt(3);
        if (x == 0) {
            return new Wall();
        }
        if (x == 1) {
            return new Room(curRoomID++);
        }
        int d = random.nextInt(2);
        return d == 0 ? new Door(Door.Directory.LEFT_RIGHT) : new Door(Door.Directory.UP_DOWN);
    }

    public static MapSite create() {
        return new Wall();
    }

    public static MapSite create(int id) {
        return new Room(id);
    }

    public static MapSite create(String directory) {
        if (directory == "up_down") {
            return new Door(Door.Directory.UP_DOWN);
        } else if (directory == "left_right") {
            return new Door(Door.Directory.LEFT_RIGHT);
        }
        return new Wall();
    }
}
