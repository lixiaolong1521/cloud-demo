package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
/*接口可以实现多个接口*/
public interface UserRepository extends JpaRepository<User,Long>,UserRepositoryEx {
}
