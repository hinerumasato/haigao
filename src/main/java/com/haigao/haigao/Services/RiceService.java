package com.haigao.haigao.Services;

import java.util.List;

import com.haigao.haigao.Models.RiceModel;

public interface RiceService {
    public List<RiceModel> findAll();
    public RiceModel findById(int id);
    public void save(RiceModel rice);
    public void update(RiceModel rice);
}
