package com.settingsun.code.demo.book.design.pattern.three.afactory.site.magic;

import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MagicRoom extends Room {
    private final String castSpell;
    public MagicRoom(int id, String castSpell) {
        super(id);
        this.castSpell = castSpell;
    }
}
