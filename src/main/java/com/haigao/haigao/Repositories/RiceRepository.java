package com.haigao.haigao.Repositories;

import java.util.List;

import com.haigao.haigao.Models.RiceModel;

public interface RiceRepository {
    public List<RiceModel> findAll();
    public RiceModel findById(int id);
    public void save(RiceModel rice);
    public void update(RiceModel rice);
}
