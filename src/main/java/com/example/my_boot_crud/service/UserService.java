package com.example.my_boot_crud.service;


import com.example.my_boot_crud.models.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    void save(User user);

    User show(Long id);

    void update(Long id, User updUser);

    void delete(Long id);
}
