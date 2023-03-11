package com.haigao.haigao.Controllers.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.haigao.haigao.Models.RiceModel;
import com.haigao.haigao.Services.RiceService;
import com.haigao.haigao.Services.impl.RiceServiceImpl;
import com.haigao.haigao.Utils.FileUtils;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RestController

public class ProductController {

    private RiceService riceService;

    @GetMapping("/admin/add-product")
    public ModelAndView addProductPage() {
        return new ModelAndView("admin/add-product.html");
    }

    @PostMapping("/admin/add-product/save")
    public ModelAndView addNewProduct(HttpServletRequest request, @RequestParam("name") String name, @RequestParam("price") double price, @RequestParam("description") String description, @RequestParam("brand") String brand, @RequestParam("kilograms") double kilograms, @RequestParam("image") MultipartFile image) {
        riceService = new RiceServiceImpl();
        ModelAndView mv = new ModelAndView("admin/add-product.html");
        if (image.isEmpty())
            mv.addObject("message", "Chưa tải hình ảnh lên");

        try {
            FileUtils.upLoadFile(image);
            String path = FileUtils.getRootPath(image);
            RiceModel newRice = new RiceModel(name, path, kilograms, price, brand, description);
            riceService.save(newRice);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

}
