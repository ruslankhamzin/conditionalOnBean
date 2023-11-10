package com.example.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnOperatingSystemCondition.class)
public @interface ConditionalOnOperatingSystem {
    String value();
}
