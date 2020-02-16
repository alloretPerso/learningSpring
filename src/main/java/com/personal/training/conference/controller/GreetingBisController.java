package com.personal.training.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingBisController {
    @GetMapping("greetingbis")
    public String greeting(Map<String,Object> model){
        model.put("name","alexandre");
        return "greeting";
    }
}
