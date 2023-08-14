package com.isaacyakl.springbootexpensetracker.services;

import com.isaacyakl.springbootexpensetracker.domain.User;
import com.isaacyakl.springbootexpensetracker.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
