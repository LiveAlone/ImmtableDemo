package org.yqj.immutables.demo.starter;

import com.google.common.collect.Lists;

/**
 * Created by yaoqijun on 2017/7/19.
 */
public class FoobarValueMain {
    public static void main(String[] args) {
        FoobarValue value = ImmutableFoobarValue.builder()
                .foo(2)
                .bar("bar test")
                .addAllBuz(Lists.newArrayList(1, 2, 3))
                .build();
        System.out.println(value.foo());
        System.out.println(value.bar());
        System.out.println(value.buz());
    }
}
