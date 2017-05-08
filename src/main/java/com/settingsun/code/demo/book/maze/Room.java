package com.settingsun.code.demo.book.maze;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {
    private int id;
    private Map<Directory, MapSite> sites = new HashMap<>();

    public String view() {
        return " ";
    }
    public String name() {
        return "R" + id;
    }

    public Room(int id) {
        this.id = id;
    }

    public void setSite(Directory directory, MapSite mapSite) {
        sites.put(directory, mapSite);
    }

    @Override
    public String toString() {
        String str = "--";
        if (sites.containsKey(Directory.NORTH)) {
            str += (sites.get(Directory.NORTH).name() + "--\n");
        } else {
            str += "----\n";
        }
        if (sites.containsKey(Directory.WEST)) {
            str += sites.get(Directory.WEST).name();
        } else {
            str += "--";
        }
        str += name();
        if (sites.containsKey(Directory.EAST)) {
            str += (sites.get(Directory.EAST).name() + "\n--");
        } else {
            str += "--\n--";
        }
        if (sites.containsKey(Directory.SOURTH)) {
            str += (sites.get(Directory.SOURTH).name() + "--\n");
        } else {
            str += "----\n";
        }
        return str;
    }

    public static void main(String[] args) {
        Room room = new Room(1);
        room.setSite(Directory.NORTH, new Room(2));
        room.setSite(Directory.EAST, new Room(3));
        System.out.println(room);
    }
}
