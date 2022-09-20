package com.nuwe.backend.services.bussineslogic;

import com.nuwe.backend.persistence.entities.Users;

public interface IUser {

    public Users name(String name);

    public Users email(String email);

    public Users password(String password);

}
