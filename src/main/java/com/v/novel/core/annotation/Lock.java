package com.v.novel.core.annotation;

import com.v.novel.core.common.constant.ErrorCodeEnum;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 分布式锁 注解
 *
 * @author Admin
 * @date 2022/6/20
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface Lock {

    String prefix();

    boolean isWait() default false;

    long waitTime() default 3L;

    ErrorCodeEnum failCode() default ErrorCodeEnum.OK;

}
