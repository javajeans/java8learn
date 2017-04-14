package com.lzh.common.test;

import org.omg.CORBA.INTERNAL;

import java.util.function.Function;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/3/17
 */

public class AppleLambdaTest {

    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g= x -> x * 2;
        Function<Integer, Integer> h= f.andThen(g);
         int result = h.apply(1);
    }
}
