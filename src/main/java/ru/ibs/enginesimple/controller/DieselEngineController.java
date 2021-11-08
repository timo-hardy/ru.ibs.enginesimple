package ru.ibs.enginesimple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ibs.enginesimple.domain.PetrolEngine;
import ru.ibs.enginesimple.service.PetrolEngineService;

import java.util.List;

@RestController
@RequestMapping("/diesel")
public class DieselEngineController {

    public class PetrolEngineController {
        private final PetrolEngineService petrolEngineService;

        @Autowired
        public PetrolEngineController(PetrolEngineService petrolEngineService) {
            this.petrolEngineService = petrolEngineService;
        }

        @GetMapping("/getAllDiesel")
        public List<PetrolEngine> getAll() {
            return petrolEngineService.findAll();
        }

        @RequestMapping
        public void add(@RequestBody PetrolEngine petrolEngine) {
            // TODO: 06.11.2021
            petrolEngineService.add(petrolEngine);
        }
    }
}
