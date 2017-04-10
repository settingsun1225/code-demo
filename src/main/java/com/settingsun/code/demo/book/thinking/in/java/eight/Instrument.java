package com.settingsun.code.demo.book.thinking.in.java.eight;

/**
 * Created by settingsun1225 on 17/4/10.
 */
public class Instrument {
    protected static final int base_price;
    static {
        base_price = 100;
        System.out.println("Instrument static base_price=" + base_price);
    }
    protected int originPrice = 200;
    protected int price;
    protected String name = "instrument";
    {
        System.out.println(price);
    }

    Instrument() {
        print("Instrument init");
        price = 201;
        getProfit();
        print("Instrument init done!");
    }

    public final String getName() {
        print("Instrument name=" + name);
        return name;
    }
    public int getPrice() {
        print("Instrument price=" + price);
        return price;
    }
    public int getProfit() {
        print("Instrument profit = price(" + getPrice() + ")-origin(" + originPrice + ")=" + (getPrice() - originPrice));
        return getPrice() - originPrice;
    }

    protected void print(String s) {
        System.out.println(s);
    }
}