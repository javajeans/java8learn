package com.lzh.common.test;

import com.lzh.model.Letter;

import java.util.function.Function;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/3/20
 */

public class LambdaTest1 {

    public static void main(String[] args) {
        Function<String,String> addHeader = Letter::addHeader;
        Function<String,String> transformationPipeLine = addHeader.andThen(Letter::addHeader).andThen(Letter::addFooter);
        System.out.println("第一个流水线：" + transformationPipeLine.apply("My Name is Lzh"));
    }
}
