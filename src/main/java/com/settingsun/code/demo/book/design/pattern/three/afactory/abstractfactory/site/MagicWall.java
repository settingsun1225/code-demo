package com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory.site;

import com.settingsun.code.demo.book.design.pattern.three.afactory.core.Directory;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Wall;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MagicWall extends Wall {
    public MagicWall(Directory directory) {
        super(directory);
    }

    @Override
    public String view() {
        switch (directory) {
            case EAST:
                return "I";
            case WEST:
                return "I";
            case NORTH:
            case SOURTH:
                return "=";
            default:
                return "";
        }
    }
}
