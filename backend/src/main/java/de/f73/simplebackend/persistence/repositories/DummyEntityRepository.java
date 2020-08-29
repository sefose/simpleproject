package de.f73.simplebackend.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.f73.simplebackend.persistence.models.DummyEntity;

/**
 * DummyEntityRepository
 */
@Repository
public interface DummyEntityRepository extends JpaRepository<DummyEntity, Long> {
    
}