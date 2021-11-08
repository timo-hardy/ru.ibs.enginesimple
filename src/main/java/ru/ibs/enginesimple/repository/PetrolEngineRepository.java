package ru.ibs.enginesimple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.enginesimple.domain.PetrolEngine;

@Repository
public interface PetrolEngineRepository extends JpaRepository<PetrolEngine, Integer> {

}
