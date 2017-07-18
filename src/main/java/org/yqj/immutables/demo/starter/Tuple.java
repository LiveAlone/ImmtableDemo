package org.yqj.immutables.demo.starter;

import org.immutables.value.Value;

/**
 * Created by yaoqijun on 2017/7/19.
 */
@Value.Immutable
public interface Tuple {

    int getIndex();

    String getName();

}
