package com.example.demo3;

import com.example.demo3.plugin.SampleInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Demo3Config {

    @Bean
    public SampleInterceptor sampleInterceptor() {
        return new SampleInterceptor();
    }
}
