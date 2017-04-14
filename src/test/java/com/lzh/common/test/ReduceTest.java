package com.lzh.common.test;

import com.lzh.model.Dish;
import com.lzh.model.Type;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/4/13
 */

public class ReduceTest {



    public static void main(String[] args) {
         List<Dish> menus = Arrays.asList(
            new Dish("pork", false, 800, Type.MEAT),
            new Dish("beef", false, 700, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("season fruit", true, 120,Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("ssalmon", false, 450, Type.FISH)
    );

       long menuConut = menuCount(menus);
       System.out.println(menuConut);
    }

    public static long menuCount(List<Dish> menu) {
        /**
         * <p>菜单总数</p>
         * @author zhiheng.li
         * @since 2017/4/13
         * @param [menu]
         * @retrun int
         */

        //return menu.stream().map(d ->1).reduce(0,(a, b) -> a+b);
        return menu.stream().count();
    }
}
