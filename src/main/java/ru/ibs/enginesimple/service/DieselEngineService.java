package ru.ibs.enginesimple.service;

import ru.ibs.enginesimple.domain.DieselEngine;

import java.util.List;

public interface DieselEngineService {
    void powerUp();

    List<DieselEngine> findAll();

    void add(DieselEngine dieselEngine);
}
