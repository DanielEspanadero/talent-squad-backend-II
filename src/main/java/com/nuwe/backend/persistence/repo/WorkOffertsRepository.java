package com.nuwe.backend.persistence.repo;

import com.nuwe.backend.persistence.entities.WorkOfferts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkOffertsRepository extends JpaRepository<WorkOfferts, Long> {
}
