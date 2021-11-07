package ru.ibs.enginesimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DieselEngineRepository extends JpaRepository<DieselEngineRepository, Integer> {
}
