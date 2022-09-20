package com.nuwe.backend.persistence.repo;

import com.nuwe.backend.persistence.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
