package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingControler {
    @RequestMapping("/student")
    public String viewStudent() {
        return "student";
    }
}
