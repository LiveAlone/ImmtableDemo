package org.yqj.immutables.demo.starter.style;

import org.immutables.value.Value;

/**
 * Created by yaoqijun on 2017/7/19.
 */
@Value.Immutable
@Value.Style(visibility = Value.Style.ImplementationVisibility.PRIVATE)
public interface Person {

    String getName();

    String getAddress();
}
