package com.haigao.haigao.Repositories;

import java.util.List;

import com.haigao.haigao.Models.RiceModel;

public interface RiceRepository {
    public List<RiceModel> findAll();
    public void save(RiceModel rice);
}
