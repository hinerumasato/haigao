package com.haigao.haigao.Controllers.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.haigao.haigao.Services.RiceService;
import com.haigao.haigao.Services.impl.RiceServiceImpl;


@Controller
public class RouteController {
    
    private RiceService riceSerivce;

    @GetMapping("/")
    public String getMethodName() {
        return "redirect:/trang-chu";
    }

    @GetMapping("/trang-chu")
    public ModelAndView home() {
        riceSerivce = new RiceServiceImpl();
        ModelAndView mv = new ModelAndView("index.html");
        mv.addObject("rices", riceSerivce.findAll());
        return mv;
    }

    @GetMapping("/gioi-thieu")
    public ModelAndView about() {
        return new ModelAndView("about.html");
    }

    @GetMapping("/tin-tuc")
    public ModelAndView news() {
        return new ModelAndView("news.html");
    }

    @GetMapping("/lien-he")
    public ModelAndView contact() {
        return new ModelAndView("contact.html");
    }
}
