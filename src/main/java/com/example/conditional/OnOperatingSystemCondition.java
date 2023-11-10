package com.example.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnOperatingSystemCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        String os = env.getProperty("os.name").toLowerCase();

        String value = (String) metadata.getAnnotationAttributes(ConditionalOnOperatingSystem.class.getName()).get("value");
        return os.contains(value.toLowerCase());
    }
}
