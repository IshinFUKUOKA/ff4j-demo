package dev.yoghurt1131.ff4jdemo.controller;

import lombok.RequiredArgsConstructor;
import org.ff4j.FF4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class GreetingController {

    private final FF4j ff4j;

    @GetMapping
    public String greeting() {
        List<String> features = new ArrayList<>();
        addFeatures(features);
        String greeting = String.format("Hello, %s World!", String.join(" ", features));

        return greeting;
    }

    private void addFeatures(List<String> features) {
        if(ff4j.check("AwesomeFeature")) {
            features.add("Awesome");
        }

        if(ff4j.check("GreatFeature")) {
            features.add("Great");
        }

        if(ff4j.check("ExcellentFeature")) {
            features.add("Excellent");
        }
    }
}
