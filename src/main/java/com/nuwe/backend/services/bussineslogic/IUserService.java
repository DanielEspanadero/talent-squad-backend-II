package com.nuwe.backend.services.bussineslogic;

import com.nuwe.backend.persistence.entities.Users;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;

public interface IUserService {

    public List<Users> findAll();

    public Users findById(Long id);

    public Users save (Users users);

    public void delete(Long id);

}
