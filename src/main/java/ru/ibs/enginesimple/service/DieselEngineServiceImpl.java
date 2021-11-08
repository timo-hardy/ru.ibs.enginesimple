package ru.ibs.enginesimple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.enginesimple.domain.DieselEngine;
import ru.ibs.enginesimple.repository.DieselEngineRepository;

import java.util.List;

@Service
public class DieselEngineServiceImpl {
    private final DieselEngineRepository dieselEngineRepository;

    @Autowired
    public DieselEngineServiceImpl(DieselEngineRepository dieselEngineRepository) {
        this.dieselEngineRepository = dieselEngineRepository;
    }

    public List<DieselEngine> findAll() {
        return dieselEngineRepository.findAll();
    }

    public void add(DieselEngine dieselEngine) {
        dieselEngineRepository.save(dieselEngine);
    }
}
