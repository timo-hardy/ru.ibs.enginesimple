package ru.ibs.enginesimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.enginesimple.domain.DieselEngine;

@Repository
public interface DieselEngineRepository extends JpaRepository<DieselEngine, Integer> {
}
