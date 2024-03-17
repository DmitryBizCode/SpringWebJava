package com.jetb.springwebjava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    @GetMapping("/")
    public String getMainPage(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        String newName = "Hello " + name;
        model.addAttribute("newName", newName); // Use "newName" instead of "name"
        return "mainD"; // Return the template name without the file extension
    }
}


