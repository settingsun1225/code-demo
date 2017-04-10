package com.settingsun.code.demo.book.thinking.in.java.fifteen;

/**
 * Created by settingsun1225 on 17/4/10.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id;}
    public String toString() { return "CountedObject " + id;}
}

