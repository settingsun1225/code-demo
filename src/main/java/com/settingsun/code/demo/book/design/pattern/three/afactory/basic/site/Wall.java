package com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site;

import com.settingsun.code.demo.book.design.pattern.three.afactory.core.Directory;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class Wall implements MapSite {
    protected Directory directory;
    public Wall(Directory directory) {
        this.directory = directory;
    }

    @Override
    public String view() {
        switch (directory) {
            case EAST:
            case WEST:
                return "|";
            case NORTH:
            case SOURTH:
                return "—";
            default:
                return "";
        }
    }
}
