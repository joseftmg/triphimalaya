package com.triphimalaya.triphimalaya.core.user.service;

import com.triphimalaya.triphimalaya.core.user.entity.User;
import com.triphimalaya.triphimalaya.core.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User delete(User user) {
        userRepository.delete(user);
        return user;
    }
}
