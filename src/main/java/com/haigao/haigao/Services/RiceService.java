package com.haigao.haigao.Services;

import java.util.List;

import com.haigao.haigao.Models.RiceModel;

public interface RiceService {
    public List<RiceModel> findAll();
    public void save(RiceModel rice);
}
