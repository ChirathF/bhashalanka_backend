package com.bhashalanka.test.practical_backend.service;

import com.bhashalanka.test.practical_backend.entity.User;
import com.bhashalanka.test.practical_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll ();
    }

    public User saveUser(@RequestBody User request){
        User user = new User (request.getUsername (), request.getPassword () );
        User createdUser = userRepository.save (user);
        return createdUser;
    }

    public boolean validateUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }


}
