package com.haigao.haigao.Repositories.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.haigao.haigao.Configs.JdbcConfig;
import com.haigao.haigao.Models.RiceModel;
import com.haigao.haigao.Repositories.RiceRepository;

public class RiceRepositoryImpl implements RiceRepository {

    private JdbcTemplate tmpl;

    public RiceRepositoryImpl() {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class)) {
            this.tmpl = context.getBean("JdbcTemplate", JdbcTemplate.class);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<RiceModel> findAll() {
        List<RiceModel> result = new ArrayList<RiceModel>();
        String query = "SELECT * FROM RICE";
        result = tmpl.query(query, (rs, i) -> {
            RiceModel rice = new RiceModel();
            rice.setId(rs.getInt("id"));
            rice.setName(rs.getNString("name"));
            rice.setBrand(rs.getNString("brand"));
            rice.setImage(rs.getString("image"));
            rice.setKilograms(rs.getDouble("kg"));
            rice.setPrice(rs.getDouble("price"));
            rice.setDescription(rs.getNString("description"));
            return rice;
        });
        return result;
    }

    @Override
    public void save(RiceModel rice) {
        String query = "INSERT INTO RICE (name, image, kg, price, brand, description) VALUES(?, ?, ?, ?, ?, ?)";
        tmpl.update(query, rice.getName(), rice.getImage(), rice.getKilograms(), rice.getPrice(), rice.getBrand(), rice.getDescription());
    }
}
