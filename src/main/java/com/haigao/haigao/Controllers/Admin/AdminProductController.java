package com.haigao.haigao.Controllers.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.haigao.haigao.Models.RiceModel;
import com.haigao.haigao.Services.RiceService;
import com.haigao.haigao.Services.impl.RiceServiceImpl;
import com.haigao.haigao.Utils.FileUtils;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AdminProductController {

    private final String addURL = "/admin/product/add";
    private final String editURL = "/admin/product/edit/{id}";
    private final String saveURL = "/admin/product/save";
    private final String updateURL = "/admin/product/update/{id}";

    private RiceService riceService;

    @GetMapping("/admin/product")
    public ModelAndView productPage() {
        riceService = new RiceServiceImpl();
        return new ModelAndView("admin/product.html").addObject("rices", riceService.findAll());
    }

    @GetMapping(addURL)
    public ModelAndView addProductPage() {
        return new ModelAndView("admin/add-product.html");
    }

    @GetMapping(editURL)
    public ModelAndView editProductPage(@PathVariable("id") int id) {
        riceService = new RiceServiceImpl();
        return new ModelAndView("admin/edit-product.html").addObject("rice", riceService.findById(id));
    }


    @PostMapping(saveURL)
    public String addNewProduct(HttpServletRequest request, @RequestParam("name") String name, @RequestParam("price") double price, @RequestParam("description") String description, @RequestParam("brand") String brand, @RequestParam("kilograms") double kilograms, @RequestParam("image") MultipartFile image) {
        riceService = new RiceServiceImpl();
        try {
            FileUtils.upLoadFile(image);
            String path = FileUtils.getRootPath(image);
            RiceModel newRice = new RiceModel(name, path, kilograms, price, brand, description);
            riceService.save(newRice);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:" + request.getHeader("Referer");
    }

    @PutMapping(updateURL)
    public String updateProduct(HttpServletRequest request, @RequestParam("name") String name, @RequestParam("price") double price, @RequestParam("description") String description, @RequestParam("brand") String brand, @RequestParam("kilograms") double kilograms, @RequestParam("image") MultipartFile image, @PathVariable("id") int id) {
        riceService = new RiceServiceImpl();
        RiceModel oldRice = riceService.findById(id);
        try {
            String path = "";
            if(!image.isEmpty()) {
                FileUtils.upLoadFile(image);
                path = FileUtils.getRootPath(image);
                FileUtils.deleteImage(oldRice.getImage());
            }
            else path = oldRice.getImage();
            
            RiceModel newRice = new RiceModel(name, path, kilograms, price, brand, description);
            newRice.setId(oldRice.getId());
            riceService.update(newRice);
            return "redirect:" + request.getHeader("Referer");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:" + request.getHeader("Referer");
    }
}
