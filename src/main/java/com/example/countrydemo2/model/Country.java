package com.example.countrydemo2.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String name;
    private String capital;
    private int population;

    public Country(int id, String name, String capital,int population) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

//    public Country(String name, String capital,int population) {
//        this(UUID.randomUUID().toString(),name,capital,population);
//    }

    public Country() {

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}