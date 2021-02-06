package ru.piatsiushyk.demoversion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/weather")
    public String back(){
        return "weather";
    }

    @GetMapping("/financ")
    public String page(){
        return "financ";
    }
}
