package com.settingsun.code.demo.book.jvm.seven;

public class ConstClass {

    static {
        System.out.println("constClass init!");
    }
    public static final String HELLO = "hello world";
}
