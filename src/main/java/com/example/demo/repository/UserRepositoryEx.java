package com.example.demo.repository;

import com.example.demo.entity.User;

import java.util.List;

public interface UserRepositoryEx {
    List<User>  findTopUser(int maxResult);
}

