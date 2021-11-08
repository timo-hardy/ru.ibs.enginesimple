package ru.ibs.enginesimple.domain;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PetrolEngine implements Engine{
    @Id
    @GeneratedValue
    private int id;
    private String modelPetrolEngine;
}
