package com.haigao.haigao.Services.impl;

import java.util.List;

import com.haigao.haigao.Models.RiceModel;
import com.haigao.haigao.Repositories.RiceRepository;
import com.haigao.haigao.Repositories.impl.RiceRepositoryImpl;
import com.haigao.haigao.Services.RiceService;

public class RiceServiceImpl implements RiceService {
    private RiceRepository riceRepository;

    public RiceServiceImpl() {
        this.riceRepository = new RiceRepositoryImpl();
    }

    @Override
    public List<RiceModel> findAll() {
        return riceRepository.findAll();
    }

    @Override
    public void save(RiceModel rice) {
        riceRepository.save(rice);
    }

    @Override
    public RiceModel findById(int id) {
        return riceRepository.findById(id);
    }

    @Override
    public void update(RiceModel rice) {
        riceRepository.update(rice);
    }
    
}
