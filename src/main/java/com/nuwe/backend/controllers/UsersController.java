package com.nuwe.backend.controllers;

import com.nuwe.backend.persistence.entities.Users;
import com.nuwe.backend.services.bussineslogic.IUserService;
import com.nuwe.backend.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(Constants.USERS_PATH)
public class UsersController {

    @Autowired
    private IUserService usersService;

    @GetMapping(Constants.ALL_PATH)
    private ResponseEntity<?> getAllUsers(){
        Users users = null;
        Map<String, Object> response = new HashMap<>();

        try {
            users = usersService.findById(id);
        } catch(DataAccessException e){
            response.put("mensaje", "Error al realizar la consulta en la base de datos!");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Users>(users, HttpStatus.OK);
    }
}
