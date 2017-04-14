package com.lzh.model;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/4/13
 */

public class Trader {

    private final String name;

    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader:" + this.name + "in" + this.city;
    }
}
