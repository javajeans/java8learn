package com.lzh.common.test;

import com.lzh.manager.FormatApple;
import com.lzh.manager.impl.AppleFancyFormatterImpl;
import com.lzh.model.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/3/17
 */

public class AppleFormatterTest {

    public static void main(String[] args) {

       List<Apple> apples = new ArrayList<>();
       apples.add(new Apple("red",155));
       apples.add(new Apple("green",120));
       System.out.println(prettyPrintApple(apples, new AppleFancyFormatterImpl()));

    }

    /**
     * 格式化打印方法
     * @param inventory
     * @param formatApple
     * @return
     */

    public static String  prettyPrintApple(List<Apple> inventory, FormatApple formatApple) {
        String out = "";
        for(Apple apple : inventory) {
            out = formatApple.accept(apple);
        }
        return out;
    }
}
