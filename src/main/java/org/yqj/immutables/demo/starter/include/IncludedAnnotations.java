package org.yqj.immutables.demo.starter.include;

import org.immutables.value.Value;

import java.lang.annotation.Retention;

/**
 * Created by yaoqijun on 2017/7/19.
 */
@Value.Include({Retention.class})
public interface IncludedAnnotations {

    Integer testAgain();

}
