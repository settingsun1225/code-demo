package com.settingsun.code.demo.book.design.pattern.three.afactory.core;

import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.Maze;
import com.settingsun.code.demo.book.design.pattern.three.afactory.basic.site.Room;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MazePrint {
    private static String[][] data;

    private static void addUnitView(Location location, String view) {
        data[location.getH()][location.getW()] = view;
    }

    public static void printMaze(Maze maze) {
        data = new String[maze.getH()*3][maze.getW()*3];
        for (int h = 0; h < maze.getH(); h++) {
            for (int w = 0; w < maze.getW(); w++) {
                Room room = maze.getRoomByLocation(h, w);
                // 初始化
                for (LocationStr locationStr : LocationStr.values()) {
                    switch (locationStr) {
                        case ONE_1:
                        case ONE_3:
                        case THREE_1:
                        case THREE_3:
                            addUnitView(convert(locationStr, h, w), "*");
                            break;
                        default:
                            addUnitView(convert(locationStr, h, w), " ");

                    }
                }
                // 每个面
                String view = room.getSite(Directory.EAST).view();
                addUnitView(convert(LocationStr.TWO_3, h, w), view);
                view = room.getSite(Directory.WEST).view();
                addUnitView(convert(LocationStr.TWO_1, h, w), view);
                view = room.getSite(Directory.NORTH).view();
                addUnitView(convert(LocationStr.ONE_2, h, w), view);
                view = room.getSite(Directory.SOURTH).view();
                addUnitView(convert(LocationStr.THREE_2, h, w), view);
            }
        }

        for (int h = 0; h < maze.getH()*3; h++) {
            if (h > 0 && h % 3 == 0) {
                continue;
            }
            for (int w = 0; w < maze.getW()*3; w++) {
                if (w > 0 && w % 3 == 0) {
                    continue;
                }
                System.out.print(data[h][w]);
            }
            System.out.println();
        }
    }

    private enum LocationStr {
        ONE_1, ONE_2, ONE_3,
        TWO_1, TWO_2, TWO_3,
        THREE_1, THREE_2, THREE_3;

    }

    private static Location convert(LocationStr str, int h, int w) {
        int minh = computeMin(h);
        int minw = computeMin(w);
        switch (str) {
            case ONE_1:
                return new Location(minh, minw);
            case ONE_2:
                return new Location(minh, minw+1);
            case ONE_3:
                return new Location(minh, minw+2);
            case TWO_1:
                return new Location(minh+1, minw);
            case TWO_2:
                return new Location(minh+1, minw+1);
            case TWO_3:
                return new Location(minh+1, minw+2);
            case THREE_1:
                return new Location(minh+2, minw);
            case THREE_2:
                return new Location(minh+2, minw+1);
            case THREE_3:
                return new Location(minh+2, minw+2);
        }
        return null;
    }

    private static int computeMin(int x) {
        return x*3;
    }

    private static class Location {
        private int h;
        private int w;
        public Location(int h, int w) {
            this.h = h;
            this.w = w;
        }
        public int getH() { return h;}
        public int getW() { return w;}
    }
}
