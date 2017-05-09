package com.settingsun.code.demo.book.design.pattern.three.afactory.maze;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by settingsun1225 on 17/5/9.
 */
public class Maze {
    private Map<Integer, Map<Integer, MapSite>> sites = new HashMap<>();
    private int height;
    private int weight;

    public Maze(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void add(int h, int w, MapSite site) {
        if (!sites.containsKey(h)) {
            sites.put(h, new HashMap<>());
        }
        sites.get(h).put(w, site);
    }

    public MapSite getSite(int h, int w) {
        if (sites.containsKey(h)) {
            if (sites.get(h).containsKey(w)) {
                return sites.get(h).get(w);
            }
        }
        return () -> "**";
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
