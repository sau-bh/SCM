package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scm.forms.UserForm;


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

    @GetMapping("/service")
    public String servicePage(Model model){
        model.addAttribute("isLogin" , false);
       
        return "services";
    }
    
    @GetMapping("/contact")
    public String contactPage(){
        return "contact";
    }

     @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

     @GetMapping("/register")
    public String register(Model model){
        UserForm userForm  = new UserForm();
        //default data bhi dal sakte hai
        // userForm.setName("Saurabh");
        model.addAttribute("userForm", userForm);
        

        return "register";
    }

    //Processing register form
    @RequestMapping(value = "/do-register" , method = RequestMethod.POST)
    public String processRegister(@ModelAttribute UserForm userForm) {
        
        System.out.println("processing registration");
        //fetch form data
        //userForm
        System.out.println(userForm);

        //validate form data
        
        //save to database
        //msg: registration successful
        //redirect to login page
        return "redirect:/register";
    }
    
   
}

