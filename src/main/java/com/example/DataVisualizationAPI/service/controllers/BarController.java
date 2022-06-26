package com.example.DataVisualizationAPI.service.controllers;

import com.example.DataVisualizationAPI.api.Bar;
import com.example.DataVisualizationAPI.api.IBar;
import org.springframework.stereotype.Controller;

@Controller
public class BarController {

    public static void main(String[] args) {

        IBar bar = new Bar(50, 250, "blue");
        System.out.println("Bar :" + bar.toString());

    }

}
