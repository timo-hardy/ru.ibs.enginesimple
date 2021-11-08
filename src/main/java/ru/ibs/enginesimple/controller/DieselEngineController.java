package ru.ibs.enginesimple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ibs.enginesimple.domain.DieselEngine;
import ru.ibs.enginesimple.domain.PetrolEngine;
import ru.ibs.enginesimple.service.DieselEngineService;
import ru.ibs.enginesimple.service.PetrolEngineService;

import java.util.List;

@RestController
@RequestMapping("/diesel")
public class DieselEngineController {

    private final DieselEngineService dieselEngineService;

    @Autowired
    public DieselEngineController(DieselEngineService dieselEngineService) {
        this.dieselEngineService = dieselEngineService;
    }

    @GetMapping("/getAllDiesel")
    public List<DieselEngine> getAll() {
        return dieselEngineService.findAll();
    }

    @RequestMapping
    public void add(@RequestBody DieselEngine dieselEngine) {
        dieselEngineService.add(dieselEngine);
    }
}
