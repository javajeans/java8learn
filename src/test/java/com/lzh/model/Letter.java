package com.lzh.model;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/3/20
 */

public class Letter {
    public static String addHeader(String text) {
        return "From Raoul, Mario and Alan:" + text;
    }

    public static String addFooter(String text) {
        return text + " Kind regards";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda","lambda");
    }
}
