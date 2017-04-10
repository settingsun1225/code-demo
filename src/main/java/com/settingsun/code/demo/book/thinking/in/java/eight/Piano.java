package com.settingsun.code.demo.book.thinking.in.java.eight;

/**
 * Created by settingsun1225 on 17/4/10.
 */
public class Piano extends Instrument {
    protected static final int base_price;
    static {
        base_price = 200;
        System.out.println("Piano static base_price=" + base_price);
    }

    protected String name = "piano";
    protected int price = 300;
    {
        System.out.println(price);
    }

    Piano() {
        print("Piano init");
        getProfit();
        print("Piano init done!");
    }

    public int getProfit() {
        print("Piano profit = price(" + getPrice() + ")-origin(" + originPrice + ")=" + (price - originPrice));
        return price - originPrice;
    }
}