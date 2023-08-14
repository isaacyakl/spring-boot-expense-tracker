package com.isaacyakl.springbootexpensetracker.repositories;

import com.isaacyakl.springbootexpensetracker.domain.User;
import com.isaacyakl.springbootexpensetracker.exceptions.EtAuthException;

public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
