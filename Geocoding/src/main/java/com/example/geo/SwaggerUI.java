package com.example.geo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerUI {

    @GetMapping("/")
    public String index() {
        return "redirect:swagger-ui.html";
    }
}