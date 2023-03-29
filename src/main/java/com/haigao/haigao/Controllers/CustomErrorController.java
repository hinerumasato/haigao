package com.haigao.haigao.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomErrorController {
    @GetMapping("/error")
    public ModelAndView error() {
        return new ModelAndView("error.html");
    }
    
}
