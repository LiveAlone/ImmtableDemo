package org.yqj.immutables.demo.starter;

/**
 * Created by yaoqijun on 2017/7/19.
 */
public class TupleValueMain {
    public static void main(String[] args) {
        ImmutableTuple tuple = ImmutableTuple.builder().index(1).name("name").build();
        System.out.println(tuple.getName());
    }
}
