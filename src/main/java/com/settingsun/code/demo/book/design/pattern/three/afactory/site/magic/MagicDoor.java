package com.settingsun.code.demo.book.design.pattern.three.afactory.site.magic;

import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MagicDoor extends Door {
    public MagicDoor(Room a, Room b) {
        super(a, b, false);
    }

    public void open() {
        this.setIsOpen(true);
    }
}
