package com.nuwe.backend.persistence.repo;

import com.nuwe.backend.persistence.entities.WorkOfferts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorksOffertsRepository extends JpaRepository<WorkOfferts, Long> {
}
