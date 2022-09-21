package com.nuwe.backend.persistence.entities;

import com.nuwe.backend.util.Constants;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = Constants.SUSCRIPTIONS)
public class Suscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = Constants.USERS_ID)
    private List<Users> users;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = Constants.WORK_OFFERTS_ID)
    private List <WorkOfferts> workOfferts;

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public List<WorkOfferts> getWorkOfferts() {
        return workOfferts;
    }

    public void setWorkOfferts(List<WorkOfferts> workOfferts) {
        this.workOfferts = workOfferts;
    }
}
