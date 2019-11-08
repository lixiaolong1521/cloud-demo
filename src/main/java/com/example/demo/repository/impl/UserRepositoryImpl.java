package com.example.demo.repository.impl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepositoryEx;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
public class UserRepositoryImpl implements UserRepositoryEx {
    @PersistenceContext
    protected EntityManager entityManager;
    public List<User> findTopUser(int maxResult){
        Query query = this.entityManager.createQuery("from User");
        query.setMaxResults(maxResult);
        return query.getResultList();

    }

    public UserRepositoryImpl() {

    }
}
