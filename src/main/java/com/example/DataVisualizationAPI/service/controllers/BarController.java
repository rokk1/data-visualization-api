package com.example.DataVisualizationAPI.service.controllers;

import com.example.DataVisualizationAPI.api.Bar;
import com.example.DataVisualizationAPI.api.IBar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class BarController {

    @GetMapping("/bars")
    public Set<IBar> getBars() {
        Set<IBar> bars = new HashSet<>();
        bars.add(new Bar(
                2,
                5,
                "grey"
        ));
        bars.add(new Bar(
                2,
                3,
                "blue"
        ));
        return bars;
    }

}
