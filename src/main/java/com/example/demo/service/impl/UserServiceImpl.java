package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.entity.dto.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    protected UserRepository userRepostitory;
    @Override
    public Page<User> getPage(Pageable pageable) {
        return this.userRepostitory.findAll(pageable);
    }

    @Override
    public User load(Long id) {
        return this.userRepostitory.findOne(id);
    }

    @Override
    @Transactional
    public User save(UserDto userDto) {
        User user = this.userRepostitory.findOne(userDto.getId());
        if (user == null){
            user = new User();
        }
        user.setNickname(userDto.getNickname());
        user.setAvatar(userDto.getAvatar());
        return this.userRepostitory.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        this.userRepostitory.delete(id);
    }
}
