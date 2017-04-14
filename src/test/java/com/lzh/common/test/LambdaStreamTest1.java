package com.lzh.common.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/3/20
 */

public class LambdaStreamTest1 {
    public static void main(String[] args) {

        List<Integer> numbersFirst = Arrays.asList(1, 2, 3);
        System.out.println(numbersFirst);

        List<Integer> numbersSecond = Arrays.asList(3, 4);

        List<int[]> pairs = numbersFirst.stream()
                .flatMap(i -> numbersSecond.stream().map(j -> new int[]{i, j}))
                .collect(toList());


    }
}

