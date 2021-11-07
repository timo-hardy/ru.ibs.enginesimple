package ru.ibs.enginesimple.domain;

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
public class DieselEngine extends Engine {
    @Id
    @GeneratedValue
    private int id;
    private String modelDieselEngine;
}
