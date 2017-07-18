package org.yqj.immutables.demo.starter.style;

import org.immutables.value.Value;

/**
 * Created by yaoqijun on 2017/7/19.
 */
@Value.Style(stagedBuilder = true)
@Value.Immutable
public interface StagePerson {

    String name();

    int age();

    boolean isEmployed();
}
