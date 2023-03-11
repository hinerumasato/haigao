package com.haigao.haigao.RestControllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haigao.haigao.Models.RiceModel;
import com.haigao.haigao.Services.RiceService;
import com.haigao.haigao.Services.impl.RiceServiceImpl;

@RestController
public class RestRiceController {

    private RiceService riceService;

    @GetMapping("/api/rice")
    public List<RiceModel> getAll() {
        this.riceService = new RiceServiceImpl();
        return riceService.findAll();
    }
}
