package com.bp.authenticatorservice.service;

import com.bp.authenticatorservice.exceptions.UserNotFoundException;
import com.bp.authenticatorservice.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public void saveUser(User user);
    public User getUserByNameAndPassword(String name, String password) throws UserNotFoundException;
}
