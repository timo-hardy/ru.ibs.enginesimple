package ru.ibs.enginesimple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ibs.enginesimple.domain.PetrolEngine;
import ru.ibs.enginesimple.repository.PetrolEngineRepository;

import java.util.List;

@Service
public class PetrolEngineServiceImpl implements PetrolEngineService {
    private final PetrolEngineRepository petrolEngineRepository;

    @Autowired
    public PetrolEngineServiceImpl(PetrolEngineRepository petrolEngineRepository) {
        this.petrolEngineRepository = petrolEngineRepository;
    }

    @Override
    public void powerUp() {
        System.out.println("Fuel - petrol");
    }

    @Override
    public List<PetrolEngine> findAll() {
        return petrolEngineRepository.findAll();
    }

    @Override
    public void add(PetrolEngine petrolEngine) {
        petrolEngineRepository.save(petrolEngine);
    }
}
