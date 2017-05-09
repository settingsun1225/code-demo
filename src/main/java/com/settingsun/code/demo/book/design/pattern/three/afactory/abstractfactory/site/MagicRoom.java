package com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory.site;

import com.settingsun.code.demo.book.design.pattern.three.afactory.core.Directory;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MagicRoom extends Room {
    private final String castSpell;
    public MagicRoom(int id, String castSpell) {
        super(id);
        this.id = id;
        this.castSpell = castSpell;
        mapSiteMap.put(Directory.EAST, new MagicWall(Directory.EAST));
        mapSiteMap.put(Directory.WEST, new MagicWall(Directory.WEST));
        mapSiteMap.put(Directory.NORTH, new MagicWall(Directory.NORTH));
        mapSiteMap.put(Directory.SOURTH, new MagicWall(Directory.SOURTH));
    }

    @Override
    public String view() {
        return "";
    }
}
