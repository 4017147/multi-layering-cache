package com.github.roger.annotation;

import org.github.roger.enumeration.ExpireMode;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
    一级缓存配置项
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface FirstCache {

    /**
     * 缓存初始Size
     */
    int initialCapacity() default  10;

    /**
     * 缓存最大Size
     */
    int maximumSize() default  5000;

    /**
     * 缓存有效时间
     */
    int expireTime() default  9;

    /**
     * 缓存时间单位
     */
    TimeUnit timeUnit() default TimeUnit.MINUTES;

    /**
     * 缓存失效模式{@link ExpireMode}
     */
    ExpireMode expireMode() default ExpireMode.WRITE;
}
