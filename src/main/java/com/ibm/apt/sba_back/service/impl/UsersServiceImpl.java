package com.ibm.apt.sba_back.service.impl;

import com.ibm.apt.sba_back.Repository.UsersRepository;
import com.ibm.apt.sba_back.domain.Users;
import com.ibm.apt.sba_back.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users addUser(Users users) {
        return null;
    }

    @Override
    public Users updateUser(Users users) {
        return null;
    }

    @Override
    public void deleteUser(int userId) {

    }

    @Override
    public List<Users> getUserList() {
        List<Users> usersList = this.usersRepository.findAll();
        return usersList;
    }

    @Override
    public Users getUserById(int userId) {
        return null;
    }
}
