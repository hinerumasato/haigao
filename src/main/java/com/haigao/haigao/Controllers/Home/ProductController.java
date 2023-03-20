package com.haigao.haigao.Controllers.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.haigao.haigao.Services.RiceService;
import com.haigao.haigao.Services.impl.RiceServiceImpl;


@Controller
public class ProductController {

    private RiceService riceService;

    @GetMapping("/san-pham")
    public ModelAndView product() {
        riceService = new RiceServiceImpl();
        ModelAndView mv = new ModelAndView("product.html");
        mv.addObject("rices", riceService.findAll());
        return mv;
    }

    @GetMapping("/san-pham/{name}")
    public ModelAndView productDetails(@PathVariable("name") String name) {
        return new ModelAndView("product-details.html").addObject("name", name);
    }
    
}
