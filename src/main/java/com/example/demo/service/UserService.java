package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> getPage(Pageable pageable);
    User load(Long id);
    //dto作为前后端分离时的数据传输
    User save(UserDto userDto);
    void delete(Long id);
}
