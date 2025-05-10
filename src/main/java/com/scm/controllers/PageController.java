package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("headline", "Home Page form controller");
        model.addAttribute("para", "All content is coming fromt the controller via model object");
        model.addAttribute("Repo", "https://google.com");
        return "home";
    }

    @GetMapping("/about")
    public String about(){
       
        return "about";
    }

    @GetMapping("/services")
    public String servicePage(Model model){
        model.addAttribute("isLogin" , false);
       
        return "services";
    }
    
}
