package com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site;

import com.google.common.collect.Maps;
import com.settingsun.code.demo.book.design.pattern.three.afactory.core.Directory;

import java.util.Map;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class Room implements MapSite {
    protected int id;
    protected Map<Directory, MapSite> mapSiteMap = Maps.newHashMapWithExpectedSize(4);
    public Room(int id) {
        this.id = id;
        mapSiteMap.put(Directory.EAST, new Wall(Directory.EAST));
        mapSiteMap.put(Directory.WEST, new Wall(Directory.WEST));
        mapSiteMap.put(Directory.NORTH, new Wall(Directory.NORTH));
        mapSiteMap.put(Directory.SOURTH, new Wall(Directory.SOURTH));
    }

    public int getId() {
        return id;
    }

    @Override
    public String view() {
        return "";
    }

    public MapSite getSite(Directory directory) {
        return mapSiteMap.get(directory);
    }

    public void setSite(Directory directory, MapSite mapSite) {
        mapSiteMap.put(directory, mapSite);
    }
}
