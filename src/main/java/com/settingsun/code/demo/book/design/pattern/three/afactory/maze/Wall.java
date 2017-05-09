package com.settingsun.code.demo.book.design.pattern.three.afactory.maze;

/**
 * Created by settingsun1225 on 17/5/9.
 */
public class Wall implements MapSite {

    @Override
    public String view() {
        return "**";
    }
}
