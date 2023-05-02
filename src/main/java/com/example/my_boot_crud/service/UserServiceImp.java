package com.example.my_boot_crud.service;

import com.example.my_boot_crud.models.User;
import com.example.my_boot_crud.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public User show(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Transactional
    @Override
    public void update(Long id, User updUser) {
        userRepository.save(updUser);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
