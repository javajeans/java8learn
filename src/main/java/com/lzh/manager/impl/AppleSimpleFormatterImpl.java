package com.lzh.manager.impl;

import com.lzh.manager.FormatApple;
import com.lzh.model.Apple;

/**
 * 描述
 *
 * @author zhiheng.li
 * @since 2017/3/17
 */

public class AppleSimpleFormatterImpl implements FormatApple {

    @Override
    public String accept(Apple apple) {
        return "An apple of" + apple.getWeight() + "g";
    }
}
