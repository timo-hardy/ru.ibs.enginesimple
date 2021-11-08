package ru.ibs.enginesimple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.enginesimple.domain.DieselEngine;
import ru.ibs.enginesimple.repository.DieselEngineRepository;

import java.util.List;

@Service
public class DieselEngineServiceImpl implements DieselEngineService {
    private final DieselEngineRepository dieselEngineRepository;

    @Autowired
    public DieselEngineServiceImpl(DieselEngineRepository dieselEngineRepository) {
        this.dieselEngineRepository = dieselEngineRepository;
    }

    @Override
    public void powerUp() {
        System.out.println("Fuel - diesel");
    }

    @Override
    public List<DieselEngine> findAll() {
        return dieselEngineRepository.findAll();
    }

    @Override
    public void add(DieselEngine dieselEngine) {
        dieselEngineRepository.save(dieselEngine);
    }
}
