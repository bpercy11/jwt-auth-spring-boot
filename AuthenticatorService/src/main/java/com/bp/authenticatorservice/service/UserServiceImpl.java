package com.bp.authenticatorservice.service;

import com.bp.authenticatorservice.exceptions.UserNotFoundException;
import com.bp.authenticatorservice.model.User;
import com.bp.authenticatorservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByNameAndPassword(String name, String password) throws UserNotFoundException {
        User user = userRepository.findByUserNameAndPassword(name, password);
        if(user == null){
            throw new UserNotFoundException("Invalid id and password");
        }
        return user;
    }
}