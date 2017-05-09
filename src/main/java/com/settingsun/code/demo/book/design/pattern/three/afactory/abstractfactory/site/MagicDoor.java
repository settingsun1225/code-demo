package com.settingsun.code.demo.book.design.pattern.three.afactory.abstractfactory.site;

import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MagicDoor extends Door {
    public MagicDoor(Room a, Room b, boolean isOpen) {
        super(a, b, isOpen);
    }

    @Override
    public String view() {
        return getIsOpen() ? "$" : "&";
    }
}
