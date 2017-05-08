package com.settingsun.code.demo.book.maze;

public interface MapSite {
    /**
     * 展示形式
     */
    String view();

    /**
     * 用来描述自己的名字，应该用2个字符表示
     * @return
     */
    String name();
}
