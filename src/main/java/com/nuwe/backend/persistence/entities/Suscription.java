package com.nuwe.backend.persistence.entities;

import com.nuwe.backend.util.Constants;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = Constants.SUSCRIPTIONS)
public class Suscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = Constants.USERS_ID)
    private Users users;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = Constants.WORK_OFFERTS_ID)
    private WorkOfferts workOfferts;

}
