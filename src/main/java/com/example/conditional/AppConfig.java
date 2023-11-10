package com.example.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnOperatingSystem("linux")
    public MyBean linuxBean() {
        return new MyBean("Linux Bean");
    }

    @Bean
    @ConditionalOnOperatingSystem("windows")
    public MyBean windowsBean() {
        return new MyBean("Windows Bean");
    }
}
