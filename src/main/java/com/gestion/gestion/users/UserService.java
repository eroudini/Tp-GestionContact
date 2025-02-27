package com.gestion.gestion.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;

    @Autowired
    private PasswordEncoder password;

    public User registerUser(User user) {
        user.setPassword(password.encode(user.getPassword()));
        return UserRepository.save(user);
    }
}
