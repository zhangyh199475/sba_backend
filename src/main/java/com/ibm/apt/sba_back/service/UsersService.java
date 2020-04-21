package com.ibm.apt.sba_back.service;

import com.ibm.apt.sba_back.domain.Users;

import java.util.List;

public interface UsersService {
    Users addUser(Users users);

    Users updateUser(Users users);

    void deleteUser(int userId);

    List<Users> getUserList();

    Users getUserById(int userId);
}
