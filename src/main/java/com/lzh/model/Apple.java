package com.lzh.model;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/3/17
 */

public class Apple {
    private String color;

    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
