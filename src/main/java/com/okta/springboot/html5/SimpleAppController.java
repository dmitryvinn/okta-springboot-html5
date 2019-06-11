package com.okta.springboot.html5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class SimpleAppController {
    
    @RequestMapping("/")
    String home() {
        return "home";
    }

    @RequestMapping("/todo")
    String todo() {
        return "todo";
    }
}