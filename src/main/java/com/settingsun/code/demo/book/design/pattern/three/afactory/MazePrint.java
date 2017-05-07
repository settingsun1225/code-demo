package com.settingsun.code.demo.book.design.pattern.three.afactory;

import com.settingsun.code.demo.book.design.pattern.three.afactory.site.Directory;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Door;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Room;
import com.settingsun.code.demo.book.design.pattern.three.afactory.site.basic.Wall;

/**
 * Created by settingsun1225 on 17/5/7.
 */
public class MazePrint {
    private static String[][] data;

    private enum Unit {
        POINT,
        WALL_VERTICAL,
        WALL_HORIZONTAL,
        DOOR_OPEN,
        DOOR_CLOSE;
    }

    private static void addUnit(Location location, Unit unit) {
        switch (unit) {
            case POINT:
                data[location.getH()][location.getW()] = "*";
                break;
            case WALL_VERTICAL:
                data[location.getH()][location.getW()] = "|";
                break;
            case WALL_HORIZONTAL:
                data[location.getH()][location.getW()] = "—";
                break;
            case DOOR_CLOSE:
                data[location.getH()][location.getW()] = "#";
                break;
            case DOOR_OPEN:
                data[location.getH()][location.getW()] = "@";
                break;
            default:
                data[location.getH()][location.getW()] = " ";
        }
    }

    public static void printMaze(Maze maze) {
        data = new String[maze.getH()*3][maze.getW()*3];
        for (int h = 0; h < maze.getH(); h++) {
            for (int w = 0; w < maze.getW(); w++) {
                Room room = maze.getRoomByLocation(h, w);

                addUnit(convert(LocationStr.ONE_1, h, w), Unit.POINT);
                addUnit(convert(LocationStr.ONE_3, h, w), Unit.POINT);
                addUnit(convert(LocationStr.THREE_1, h, w), Unit.POINT);
                addUnit(convert(LocationStr.THREE_3, h, w), Unit.POINT);
                if (room.getSite(Directory.EAST) instanceof Door) {
                    addUnit(convert(LocationStr.TWO_3, h, w), getDoorUnit((Door)room.getSite(Directory.EAST)));
                } else if (room.getSite(Directory.EAST) instanceof Wall) {
                    addUnit(convert(LocationStr.TWO_3, h, w), Unit.WALL_VERTICAL);
                }

                if (room.getSite(Directory.WEST) instanceof Door) {
                    addUnit(convert(LocationStr.TWO_1, h, w), getDoorUnit((Door)room.getSite(Directory.WEST)));
                } else if (room.getSite(Directory.WEST) instanceof Wall) {
                    addUnit(convert(LocationStr.TWO_1, h, w), Unit.WALL_VERTICAL);
                }

                if (room.getSite(Directory.NORTH) instanceof Door) {
                    addUnit(convert(LocationStr.ONE_2, h, w), getDoorUnit((Door)room.getSite(Directory.NORTH)));
                } else if (room.getSite(Directory.NORTH) instanceof Wall) {
                    addUnit(convert(LocationStr.ONE_2, h, w), Unit.WALL_HORIZONTAL);
                }

                if (room.getSite(Directory.SOURTH) instanceof Door) {
                    addUnit(convert(LocationStr.THREE_2, h, w), getDoorUnit((Door)room.getSite(Directory.SOURTH)));
                } else if (room.getSite(Directory.SOURTH) instanceof Wall) {
                    addUnit(convert(LocationStr.THREE_2, h, w), Unit.WALL_HORIZONTAL);
                }
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
                if (data[h][w] == null) {
                    data[h][w] = " ";
                }
                System.out.print(data[h][w]);
            }
            System.out.println();
        }
    }

    private static Unit getDoorUnit(Door door) {
        return door.getIsOpen() ? Unit.DOOR_OPEN : Unit.DOOR_CLOSE;
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
