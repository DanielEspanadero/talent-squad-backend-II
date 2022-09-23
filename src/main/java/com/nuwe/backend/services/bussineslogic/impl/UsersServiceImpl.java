package com.nuwe.backend.services.bussineslogic.impl;

import com.nuwe.backend.persistence.entities.Users;
import com.nuwe.backend.persistence.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsersServiceImpl {

    @Autowired
    UsersRepository usersRepository;

    public ArrayList<Users> getUsers(){
        return (ArrayList<Users>) usersRepository.findAll();
    }

    public Users saveUser(Users user){
        return usersRepository.save(user);
    }
}
