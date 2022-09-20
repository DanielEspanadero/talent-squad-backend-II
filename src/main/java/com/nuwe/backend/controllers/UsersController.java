package com.nuwe.backend.controllers;

import com.nuwe.backend.persistence.entities.Users;
import com.nuwe.backend.services.bussineslogic.IUser;
import com.nuwe.backend.util.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.USERS_PATH)
public class UsersController {


    @GetMapping(Constants.ALL_PATH)
    private void getAllUsers(){

    }
}
