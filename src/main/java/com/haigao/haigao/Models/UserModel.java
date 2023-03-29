package com.haigao.haigao.Models;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
    private int id;
    private String username;
    private String password;
    private String role;
    private String name;
    private String phone;
    private List<Integer> newsIdList;
    private List<Integer> saleIdList;

    public UserModel(String username, String password, String role, String name, String phone) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.phone = phone;
        this.newsIdList = new ArrayList<>();
        this.saleIdList = new ArrayList<>();
    }

    public UserModel(int id, String username, String password, String role, String name, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.phone = phone;
        this.newsIdList = new ArrayList<>();
        this.saleIdList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Integer> getNewsIdList() {
        return newsIdList;
    }

    public void setNewsIdList(List<Integer> newsIdList) {
        this.newsIdList = newsIdList;
    }

    public List<Integer> getSaleIdList() {
        return saleIdList;
    }

    public void setSaleIdList(List<Integer> saleIdList) {
        this.saleIdList = saleIdList;
    }
    
}
