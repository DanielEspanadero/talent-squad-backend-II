package com.nuwe.backend.controllers;

import com.nuwe.backend.persistence.entities.Users;
import com.nuwe.backend.services.bussineslogic.impl.UsersServiceImpl;
import com.nuwe.backend.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(Constants.USERS_PATH)
public class UsersController {

    @Autowired
    UsersServiceImpl usersService;

    @GetMapping(Constants.ALL_PATH)
    private ArrayList<Users> getAllUsers(){

        return usersService.getUsers();

    }

    @PostMapping(Constants.ADD_USER)
    private Users saveUsers(@RequestBody Users user){
        return this.usersService.saveUser(user);
    }
}
