package dev.yoghurt1131.ff4jdemo.config;

import org.ff4j.FF4j;
import org.ff4j.core.Feature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FF4JConfiguration {
    @Bean
    public FF4j ff4j() {
        FF4j ff4j = new FF4j()
                .createFeature(awesomeFeature())
                .createFeature(greatFeature())
                .createFeature(excellentFeature());
        return ff4j;
    }

    private Feature awesomeFeature() {
        return new Feature("AwesomeFeature", true);
    }

    private Feature greatFeature() {
        return new Feature("GreatFeature", false);
    }

    private Feature excellentFeature() {
        return new Feature("ExcellentFeature", false);
    }
}