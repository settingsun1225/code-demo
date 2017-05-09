package com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class Door implements MapSite {
    private Room a;
    private Room b;
    private boolean isOpen = false;

    public Door(Room a, Room b, boolean isOpen) {
        this.a = a;
        this.b = b;
        this.isOpen = isOpen;
    }

    public Room otherSideFrom(Room x) {
        return (x == a) ? b : ((x == b) ? a : null);
    }

    @Override
    public String view() {
        return isOpen ? "@" : "#";
    }

    public boolean getIsOpen() { return isOpen;}

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
