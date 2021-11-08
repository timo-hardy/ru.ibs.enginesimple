package ru.ibs.enginesimple.service;

import ru.ibs.enginesimple.domain.PetrolEngine;

import java.util.List;

public interface PetrolEngineService {
    void powerUp();

    List<PetrolEngine> findAll();

    void add(PetrolEngine petrolEngine);
}
