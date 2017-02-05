package com.ft.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解 拦截Controller
 * Created by poseture on 2017/2/5.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Token {

    /**
     * 需要生成token
     * @return
     */
    boolean need() default false;


    /**
     * 需要验证
     * @return
     */
    boolean valid() default false;
}
