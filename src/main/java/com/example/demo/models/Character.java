package com.example.demo.models;

import java.util.ArrayList;

//se agrega el siguiente schema para facilitar la manipulacion de los datos al momento de unir con el schema origin
public class Character {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private ArrayList<String> episode;

    public Character() {
    }

    public Character(int id, String name, String status, String species, String type, ArrayList<String> episode) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.episode = episode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getEpisode() {
        return episode;
    }

    public void setEpisode(ArrayList<String> episode) {
        this.episode = episode;
    }
}
