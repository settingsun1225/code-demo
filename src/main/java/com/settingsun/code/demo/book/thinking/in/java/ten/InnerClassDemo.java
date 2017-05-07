package com.settingsun.code.demo.book.thinking.in.java.ten;

/**
 * Created by settingsun1225 on 17/4/16.
 */
public class InnerClassDemo {

    public Contents contents() {
        return new Contents()  {
            private int i = 11;
            public int value() { return i;}
        };
    }

    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        Contents c = innerClassDemo.contents();
        System.out.println(c.value());
    }

    public interface Contents {
        public int value();
    }
}
