package com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic;

import com.google.common.collect.Maps;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.Directory;

import java.util.Map;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class Room implements MapSite {
    private int id;
    private Map<Directory, MapSite> mapSiteMap = Maps.newHashMapWithExpectedSize(4);
    public Room(int id) {
        this.id = id;
        mapSiteMap.put(Directory.EAST, new Wall());
        mapSiteMap.put(Directory.WEST, new Wall());
        mapSiteMap.put(Directory.NORTH, new Wall());
        mapSiteMap.put(Directory.SOURTH, new Wall());
    }

    public int getId() {
        return id;
    }

    public void enter() {

    }

    public MapSite getSite(Directory directory) {
        return mapSiteMap.get(directory);
    }

    public void setSite(Directory directory, MapSite mapSite) {
        mapSiteMap.put(directory, mapSite);
    }
}
